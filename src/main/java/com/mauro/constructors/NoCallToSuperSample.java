package com.mauro.constructors;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 08:22
 * To change this template use File | Settings | File Templates.
 */
public class NoCallToSuperSample extends SuperContructorClass {

    public NoCallToSuperSample() {
        this("hello");
    }

    public NoCallToSuperSample(String salutation) {
        this(salutation, salutation);
        System.out.println(salutation);
    }
    public NoCallToSuperSample(String a, String b) {
        System.out.println(a + b);
    }

    public static void main(String args []) {
        System.out.println("*** About to start invocation ***");
        NoCallToSuperSample nctss = new NoCallToSuperSample();
        System.out.println("*** Completed invocation ***");
    }
}
