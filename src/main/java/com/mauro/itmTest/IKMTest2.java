package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */


public class IKMTest2 extends Sub {
    @Override
    public String value() {
        return "IKMTest";
    }
    public static void main(String[] args) {
        IKMTest2 testClass = new IKMTest2();
        boolean b = false;
        char i = 't';
        if (testClass instanceof IKMType) {
            if (b = false) {
                System.out.println(((Super) testClass).value());
            } else {
                System.out.println(b);
            }
        } else {
            if (b = true) {
                System.out.println(((Sub) testClass).value());
            } else {
                System.out.println(i);
            }
        }
    }
}
interface IKMType {
    String value();
}
class Super implements IKMType {
    @Override
    public String value() {
        return "Super";
    }
}
class Sub extends Super {
    @Override
    public String value() {
        return "Sub";
    }
}
