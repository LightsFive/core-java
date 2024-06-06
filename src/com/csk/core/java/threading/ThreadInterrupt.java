package com.csk.core.java.threading;

public class ThreadInterrupt extends Thread {

    Thread mainThread;

    @Override
    public void run() {

        mainThread.interrupt();
        for (int i=0; i < 10; i++) {
            System.out.println("Thread");
        }
    }

    static class Test {

        public static void main(String[] args) {

            ThreadInterrupt th = new ThreadInterrupt();
            th.mainThread = Thread.currentThread();

            th.setDaemon(true);

            th.start();

            try {
                th.join();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
