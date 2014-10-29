package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */

class Parent {
    protected static int count = 0;
    public Parent() { count++; }
    static int getCount() { return count; }
}

public class Child extends Parent {
    public Child() { count++; }
    public static void main(String [] args) {
        System.out.println("Count = " + getCount());
        Child obj = new Child();
        System.out.println("Count = " + getCount());
    }
}

