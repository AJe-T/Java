package com.threadPriorityDemo;

public class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("run() method started..."+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("run() method ended..."+Thread.currentThread().getName());
	}

}
