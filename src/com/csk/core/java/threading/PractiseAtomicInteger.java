package com.csk.core.java.threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/*
use atomic integer to concurrent access to shared resource here. Locks and Synchronization are not required.
 */
public class PractiseAtomicInteger {

    static class ShareResource {

        //static AtomicInteger count = new AtomicInteger(0);
        static int count = 0;
    }

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch cdl = new CountDownLatch(3);

        new Thread(getRunnable(cdl), "Thread1").start();
        new Thread(getRunnable(cdl), "Thread2").start();
        new Thread(getRunnable(cdl), "Thread3").start();

        cdl.await();
        System.out.println(ShareResource.count);

    }

    static Runnable getRunnable(CountDownLatch cdl) {

        return () -> {
            System.out.println("Starting " + Thread.currentThread().getName());

            for (int i=0; i < 10; i++) {
                ShareResource.count = ShareResource.count + 1;
            }

            cdl.countDown();
        };
    }
}
