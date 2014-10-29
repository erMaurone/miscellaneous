package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public class VisitorTest {
    public String createLog = "logOneTest", createLog1;
    public void createLog(Visitor visitor) {
        visitor.createLog(this);
    }
    public static void main(String[] args) {
        new VisitorTest().createLog(new IKMVisitor());
    }
}
interface Visitor {
    public String createLog = "logOneInterface",createLog1 = null;
    void createLog(Object obj);
}
class IKMVisitor implements Visitor {
    public String createLog, createLog1 = "logOneClass";
    @Override
    public void createLog(Object obj) {
        if (createLog1.isEmpty()) {
            System.out.println("empty");
        }
        else {
            System.out.println(((VisitorTest)obj).createLog1 + Visitor.createLog1);
        }
    }
}
