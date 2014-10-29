package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:12
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionClasses {

}

class MyException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public MyException(String str){
        super(str);
    }
    public String getLocalizedMessage(){
        return "This is MyException";
    }
}

/*
class MyException1 extends Error{
    private static final long serialVersionUID = 1L;
    @Override
    public int getMessage(){
        return 254;
    }
}           */

/*
class MyException2 extends CheckedException {
    private static final long serialVersionUID = 1L;
    public MyException2(String str){
      //  super(str);
    }
    public String getMessage(){
        return "This is MyException";
    }
}    */

class MyException3 extends Exception{
    public String getReason() throws Exception{
        throw new Exception();
    }
}
class MyException4 {
    private static final long serialVersionUID = 1L;
    public MyException4(String message){
    }
    public String getMessage(){
        return "This is MyException";
    }
}
