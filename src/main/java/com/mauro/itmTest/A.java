package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:07
 * To change this template use File | Settings | File Templates.
 */
class A{
    static int total = 10;
    public void call() {
        int total = 5;
        System.out.println(this.total);
    }
    public static void main (String args []) {
        A a1 = new A();
        a1.call();
    }
}
