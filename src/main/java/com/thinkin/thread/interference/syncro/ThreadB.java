/**
 * 
 */
package com.thinkin.thread.interference.syncro;

import com.thinkin.thread.interference.syncro.SynchronizedCounter;

/**
 * @author ashish
 *
 */
public class ThreadB implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	SynchronizedCounter counter;

	public ThreadB(SynchronizedCounter counter) {
		// TODO Auto-generated constructor stub
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " : The value of C is " + counter.getC());
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter.decrement();
		System.out.println(Thread.currentThread().getName() + " : The value of C is " + counter.getC());
	}

}
