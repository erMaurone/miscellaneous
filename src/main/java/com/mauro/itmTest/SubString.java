package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */
public class SubString {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder ("buffering");
        sb.replace (2, 7, "BUFFER");
        sb.delete (2, 4);
        String s = sb.substring (1, 5);
        System.out.println (s);
    }
}
