package com.mauro.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 07/10/2014
 * Time: 11:35
 * To change this template use File | Settings | File Templates.
 */
public class StopThread1 {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                }
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;

    }
}
