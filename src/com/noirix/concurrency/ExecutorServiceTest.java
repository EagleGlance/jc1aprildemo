package com.noirix.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceTest {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executor1 = Executors.newCachedThreadPool();
        ExecutorService executor2 = Executors.newSingleThreadExecutor();

        //3 task -> 3 thread
        //5 task -> 2 new threads -> 5 total thread inside pool

        // Runnable, return void, nothing, submit and run the task async
        //executor.submit(() -> System.out.println("I'm Runnable task."));

        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
                System.out.println("I'm Runnable task.");
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
                System.out.println("I'm Runnable task 2.");
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
                System.out.println("I'm Runnable task 3.");
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getId());
                System.out.println("I'm Runnable task 4.");
            }
        });

        for (int i = 0; i < 10; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getId());
                    System.out.println("I'm Runnable task ");
                }
            });
        }


        /* Before Java 8


        Future<Integer> futureTask1 = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                System.out.println("I'm Callable task.");
                return 1 + 1;
            }
        });*/

        // Callable, return a future, submit and run the task async
//        Future<Integer> futureTask1 = executor.submit(() -> {
//            System.out.println("I'm Callable task.");
//            return 1 + 1;
//        });

        Future<Integer> futureTask1 = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                System.out.println("I'm Callable task.");
                //some logic
                try {
                    Thread.sleep(3100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return 100 + 100;
            }
        });

        try {

            otherTask("Before Future Result");

            // block until future returned a result,
            // timeout if the future takes more than 5 seconds to return the result
            Integer result = futureTask1.get(3, TimeUnit.SECONDS);

            System.out.println("Get future result : " + result);

            otherTask("After Future Result");


        } catch (InterruptedException e) {// thread was interrupted
            e.printStackTrace();
        } catch (ExecutionException e) {// thread threw an exception
            e.printStackTrace();
            System.err.println("Execution error");
        } catch (TimeoutException e) {// timeout before the future task is complete
            e.printStackTrace();
            System.err.println("time out");
        } finally {

            // shut down the executor manually
            executor.shutdown();

        }

    }

    private static void otherTask(String name) {
        System.out.println("I'm other task! " + name);
    }
}
