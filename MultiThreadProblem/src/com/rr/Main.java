package com.rr;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();

		ExecutorService service = Executors.newFixedThreadPool(100);

		List<Future<?>> list = new ArrayList<>();

		for (int i = 1; i <= 1000; i++) {

			Future<?> future = service.submit(new ThreadImpl(singleton));
			list.add(future);
		}

		for (Future<?> item : list) {

			try {
				Object obj = item.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		service.shutdown();

		int val = singleton.getVal();

		System.out.println("final val is : " + val);

	}

}
