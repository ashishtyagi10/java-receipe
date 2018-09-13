/**
 * 
 */
package com.thinkin.thread;

/**
 * @author ashish
 *
 */
public class HelloRunnable implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
		System.out.println(i+" : "+Thread.currentThread().getName()+" :Hello from Runnable!!!");
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread(new HelloRunnable()).start();
		new Thread(new HelloRunnable()).start();
		new Thread(new HelloRunnable()).start();
		new Thread(new HelloRunnable()).start();
	}

}
