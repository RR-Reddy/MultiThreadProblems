package com.rr;

public class ThreadImpl implements Runnable {

	private Singleton singleton;

	@Override
	public void run() {

		singleton.process();

	}

	public ThreadImpl(Singleton singleton) {
		super();
		this.singleton = singleton;
	}

}
