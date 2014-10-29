package com.mauro.itmTest;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public class TestDate {
    public static void main(String[] args) {
        System.out.println(String.format("Local time: %tH:%tM:%tS", Calendar.getInstance(),Calendar.getInstance(),Calendar.getInstance()));
        //System.out.println(String.format("Local time: %tT", Calendar.getInstance().toString()));
        //System.out.println(String.format("Local time: %1$tB", Calendar.getInstance()));
        System.out.println(String.format("Local time: %tT", Calendar.getInstance()));
        //System.out.println(String.format("Local time: %1$", Calendar.getInstance()));
    }
}
