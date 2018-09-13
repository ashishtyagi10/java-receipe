/**
 * 
 */
package com.thinkin.thread.interference;

/**
 * @author ashish
 *
 */
public class ThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		for (int i = 0; i <= 10; i++) {
			new Thread(new ThreadA(counter)).start();
			new Thread(new ThreadB(counter)).start();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : The final value of C is " + counter.getC());
		}
	}

}
