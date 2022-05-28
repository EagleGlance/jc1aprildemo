package com.noirix.concurrency;

import com.noirix.util.ThreadInfo;

public class ThreadTest {
    public static void main(String[] args) {

        Class<ThreadInfo> threadInfoClass = ThreadInfo.class;
        System.out.println(threadInfoClass.getName());
        System.out.println(threadInfoClass.getCanonicalName());
        System.out.println(threadInfoClass.getClassLoader().getName());

        CustomThread customThread = new CustomThread();

        Run run = new Run();
        Thread threadWithRunLogic = new Thread(run);

        customThread.start();
        threadWithRunLogic.start();
    }
}
