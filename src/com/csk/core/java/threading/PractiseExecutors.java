package com.csk.core.java.threading;

import java.util.List;
import java.util.concurrent.*;

public class PractiseExecutors {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        var future = executorService.submit(() -> List.of(1, 2, 3, 4, 5)
                .stream()
                .filter(i -> i % 2 == 0)
                .toList());

        var future1 = executorService.submit(() -> {

            for (int i=0; i < 5; i++) {
                System.out.println(i);
            }
        }, 5);

        future.get().forEach(System.out::println);

        if (future1.isDone()) {

            System.out.println("Done" + future1.get());
        }

        executorService.shutdown();
    }
}
