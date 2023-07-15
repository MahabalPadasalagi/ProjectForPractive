package com.udemy.mahabal;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
	static int counter=0;
	static Lock lock=new ReentrantLock();

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new Runnable() {
			@Override
			public void run() {
				lock.lock();
				for(int i=1;i<=1000;i++) {
					counter++;
					
				}
				lock.unlock();
			}
		});
		
		thread1.start();
		
		Thread thread2=new Thread(new Runnable() {
			@Override
			public void run() {
				lock.lock();
				for(int i=1;i<=1000;i++) {
					counter++;
					
				}
				lock.unlock();
				System.out.println(counter);
			}
		});
		
		thread2.start();
		

	}

}
