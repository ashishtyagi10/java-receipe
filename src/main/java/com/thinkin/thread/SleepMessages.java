/**
 * 
 */
package com.thinkin.thread;

/**
 * @author ashish
 *
 */
public class SleepMessages extends Thread {

	/**
	 * @param args
	 */
	public static void main(String args[])
	        throws InterruptedException {
	        String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };

	        for (int i = 0;
	             i < importantInfo.length;
	             i++) {
	            //Pause for 4 seconds
	            Thread.sleep(4000);
	            //Print a message
	            System.out.println(Thread.currentThread().getName()+" : "+importantInfo[i]);
	        }
	    }
}
