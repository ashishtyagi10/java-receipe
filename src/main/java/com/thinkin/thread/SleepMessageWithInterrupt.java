/**
 * 
 */
package com.thinkin.thread;

/**
 * @author ashish
 *
 */
public class SleepMessageWithInterrupt extends Thread {

	private static String[] importantInfos;

	public void run() {
		for (int i = 0; i < importantInfos.length; i++) {
			// Pause for 4 seconds
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				System.out.println("We have been interrupted !! no more message");
				e.printStackTrace();
				return;
			}
			// Print a message
			System.out.println(Thread.currentThread().getName() + " : " + importantInfos[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		importantInfos = new String[] { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
				"A kid will eat ivy too" };
		new Thread(new SleepMessageWithInterrupt()).start();

	}

}
