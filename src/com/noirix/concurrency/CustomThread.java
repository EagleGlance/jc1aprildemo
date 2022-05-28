package com.noirix.concurrency;

import com.noirix.util.ThreadInfo;

public class CustomThread extends Thread {

    volatile int i = 100;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            ThreadInfo.getThreadInfo(Thread.currentThread());
            System.out.println("Thr");

            try {
                Thread.sleep(500); //переход в состояние сна потока на 500 милисекунд
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
