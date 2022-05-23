package com.noirix.concurrency;

import com.noirix.util.ThreadInfo;

public class CustomThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            ThreadInfo.getThreadInfo(Thread.currentThread());
            System.out.println("Thread");

            try {
                Thread.sleep(500); //переход в состояние сна потока на 500 милисекунд
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
