package com.runMethodCall;

public class ThreadDemo implements Runnable {
     
	public void run() {
		System.out.println("run method"+" : "+Thread.currentThread().getName());
	}
}
