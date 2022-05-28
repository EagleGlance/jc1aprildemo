package com.noirix.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerSimpleTest {
    public static void main(String[] args) {

        /*Producing events, tasks*/
        Callable<Integer> task1 = () -> {
            System.out.println(Thread.currentThread().getId());
            System.out.println("I'm Callable task 1.");
            return 100;
        };

        Callable<Integer> task2 = () -> {
            System.out.println(Thread.currentThread().getId());
            System.out.println("I'm Callable task 2.");
            return 200;
        };

        Callable<Integer> task3 = () -> {
            System.out.println(Thread.currentThread().getId());
            System.out.println("I'm Callable task 3.");
            return 300;
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        try {

            /*Storing and caching events for future processing*/
            BlockingQueue<Callable<Integer>> tasksQueue = new ArrayBlockingQueue<>(10);
            tasksQueue.put(task1);
            tasksQueue.put(task2);
            tasksQueue.put(task3);

            /*get event from queue*/
            Callable<Integer> take = tasksQueue.take();
            Callable<Integer> poll = tasksQueue.poll(3, TimeUnit.SECONDS);

            Future<Integer> takeResult = executor.submit(take);
            Future<Integer> pollResult = executor.submit(poll);

            System.out.println(takeResult.get());
            if (takeResult.isDone()) {
                System.out.println(takeResult.get());
            }
            System.out.println(pollResult.get());
            if (pollResult.isDone()) {
                System.out.println(pollResult.get());
            }


        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }

    }
}
