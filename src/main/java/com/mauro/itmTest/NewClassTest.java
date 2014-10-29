package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
public class NewClassTest {

    interface MyInterface {
        void method1();
        void method2();
    }
    abstract class Parent implements MyInterface {
        //abstract void method1();
    }
    public abstract class Child extends Parent implements MyInterface {
        public void method1() {
            //do stuff
        }
        public abstract void method2();
    }
}
