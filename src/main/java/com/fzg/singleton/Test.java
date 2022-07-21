package com.fzg.singleton;

import static java.lang.Thread.sleep;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            sleep(1);
            new Thread(()->{
                Single.getInstance();
            }).start();
            Single.getInstance();
        }
    }
}
