package com.noirix.concurrency;

public class ThreadTest {
    public static void main(String[] args) {

        CustomThread customThread = new CustomThread();

        Run run = new Run();
        Thread threadWithRunLogic = new Thread(run);

        customThread.start();
        threadWithRunLogic.start();
    }
}
