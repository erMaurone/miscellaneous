package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 */
public class IkmTest {

    private static int count;
    static {
        System.out.println("In block 1");
        count = 10;
    }

    private int[] data;
    {
        System.out.println("In block 2");
        data = new int[count];
        for (int i = 0; i < count; i++) {
            data[i] = i;
        }
    }

    public static void main (String[] args) {
        System.out.println("Count = " + count);
        System.out.println("Before 1st call to new");
        IkmTest test1 = new IkmTest();
        System.out.println("Before 2nd call to new");
        IkmTest test2 = new IkmTest();
    }
}
