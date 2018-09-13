/**
 * 
 */
package com.thinkin.thread;

/**
 * @author ashish
 *
 */
public class SleepMessages extends Thread {

	private static String importantInfos[];

	/**
	 * @param args
	 */
	public static void main(String args[]) throws InterruptedException {
		importantInfos = new String[] { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
				"A kid will eat ivy too" };
		new Thread(new SleepMessages()).start();
	}

	public void run() {
		for (int i = 0; i < importantInfos.length; i++) {
			// Pause for 4 seconds
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Print a message
			System.out.println(Thread.currentThread().getName() + " : " + importantInfos[i]);
		}
	}
}
