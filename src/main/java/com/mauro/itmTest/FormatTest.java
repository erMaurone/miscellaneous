package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
public class FormatTest{
    public static void main(String[] args) {
        String stringA = "A";
        String stringB = "B";
        String stringnull = null;
        StringBuffer bufferc = new StringBuffer("C");
        Formatter fmt = new Formatter(bufferc);

        fmt.format("%s%s", stringA, stringB);
        System.out.println("Line 1: "+ fmt);

        fmt.format("%-2s", stringB);
        System.out.println("Line 2: "+ fmt);

        fmt.format("%b", stringnull);
        System.out.println("Line 3: "+ fmt);
    }
}
