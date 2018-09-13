/**
 * 
 */
package com.thinkin.thread;

/**
 * @author ashish
 *
 */
public class HelloThread extends Thread {
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName()+" :Hello from Thread!!!");
			}
	}

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new HelloThread()).start();
		new Thread(new HelloThread()).start();
		new Thread(new HelloThread()).start();
		new Thread(new HelloThread()).start();

	}

}
