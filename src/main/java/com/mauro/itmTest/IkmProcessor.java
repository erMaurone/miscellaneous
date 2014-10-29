package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;
import java.util.List;
public class IkmProcessor {
    public List<String> queueSequence;
    public void setUp() {
        try {
            establishQueueSequence();
        }
        finally {
            cleanupQueueSequence();
            System.out.println("Queue sequence successfully cleaned up");
        }
    }
    private void cleanupQueueSequence() {
        if (queueSequence.size() > 0) {
            System.out.println("Queue size > 0");
        }
    }
    private void establishQueueSequence() {
        if (true) {
            throw new IllegalArgumentException();
        }
        queueSequence = new ArrayList<String>();
    }

    public static void main(String[] args) {
        IkmProcessor processor = new IkmProcessor();
        processor.setUp();
        System.out.println("Processing complete");
    }
}

