package com.mauro.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 07/10/2014
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */
public class StopThread2 {
    private static final long startTime = System.currentTimeMillis();
    private static long endTime;
    private static boolean stopRequested;
    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean isStopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (! isStopRequested()) {
                    i++;
                }
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
        endTime = System.currentTimeMillis();
        System.out.println("start time = " + startTime + ", end time = " + endTime + ", difference = "
            + (endTime - startTime));

    }
}
