package com.thinkin.deadlock;

public class Deadlock {
    public static void main(String... args) {
        final Friend alpha = new Friend("alpha");
        final Friend beta = new Friend("beta");

        new Thread(new Runnable() {
            @Override
            public void run() {
                alpha.bow(beta);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                beta.bow(alpha);
            }
        }).start();
    }

    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void bow(Friend friend) {
            System.out.println(this.name + " has bowed to me " + friend.getName());
        }

        public synchronized void bowBack(Friend friend) {
            System.out.println(this.name + " has bowed back to me " + friend.getName());
        }
    }
}
