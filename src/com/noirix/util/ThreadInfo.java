package com.noirix.util;

public class ThreadInfo {
    public static synchronized void getThreadInfo(Thread thread) {
        System.out.println();
        System.out.println("Thread info: ");
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println();
    }
}
