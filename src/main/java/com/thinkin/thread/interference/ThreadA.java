/**
 * 
 */
package com.thinkin.thread.interference;

/**
 * @author ashish
 *
 */
public class ThreadA implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */

	Counter counter;

	public ThreadA(Counter c) {
		this.counter = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " : The value of C is " + counter.getC());
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		counter.increment();
		System.out.println(Thread.currentThread().getName() + " : The value of C is " + counter.getC());
	}

}
