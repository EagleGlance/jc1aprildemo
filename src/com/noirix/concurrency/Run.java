package com.noirix.concurrency;

import com.noirix.util.ThreadInfo;

public class Run implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            ThreadInfo.getThreadInfo(Thread.currentThread());
            System.out.println("Run");

            try {
                Thread.sleep(500); //переход в состояние сна потока на 500 милисекунд
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
