package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
class aClass {
    int index = 1;
    public void printTypeName(){
        System.out.print( "Superclass" );
    }
}
class Subclass extends aClass {
    int index = 2;
    public void printTypeName(){
        System.out.print( "Subclass" );
    }
}
public class SuperClass {
    public static void main( String[] args ){
        aClass superclass = new Subclass();
        superclass.printTypeName();
        System.out.print( "," + superclass.index );
    }
}
