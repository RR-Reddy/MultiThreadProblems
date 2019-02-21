package com.rr;

import java.util.Random;

public class Singleton {

	private int val = 0;

	//
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
	
	
//
	
	
	public int getVal() {
		return val;
	}

	public void process() {

		int temp = new Random().nextInt(1000);
		
		try {
			Thread.sleep(temp);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if ( true ) {

			//System.out.println(" val inc done");

			val++;
		}
	}

}
