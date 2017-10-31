package com.thinkin.thread.interference.syncro;

public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
	}

    public synchronized void decrement() {
        c--;
	}

    public synchronized int getC() {
        return c;
	}

    public synchronized void setC(int c) {
        this.c = c;
	}

}
