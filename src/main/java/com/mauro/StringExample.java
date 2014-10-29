package com.mauro;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 12:25
 * To change this template use File | Settings | File Templates.
 */
public class StringExample {
    public static void main(String args[]) {
        String s1 = "spring ";
        String s2 = s1 + "summer ";
        System.out.println(s1 + " - " + s2);
        s1.concat("fall ");   // concat returns a string and does not mofiy the string passed as an input
        System.out.println(s1 + " - " + s2);
        s2.concat(s1);
        System.out.println(s1 + " - " + s2);
        s1+="winter ";
        System.out.println(s1 + " - " + s2);
    }
}
