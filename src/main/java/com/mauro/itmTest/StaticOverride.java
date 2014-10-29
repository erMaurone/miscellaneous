package com.mauro.itmTest;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */
public class StaticOverride {



    public static void main(String[] args) {
        Invoice i = new Invoice();
        Invoice i_si = new SalesInvoice();
        SalesInvoice si = new SalesInvoice();
        //com.mauro.itmTest.SalesInvoice si_i = new com.mauro.itmTest.Invoice();
        System.out.println(i.formatId("1234"));
        System.out.println(i_si.formatId("1234"));
        System.out.println(si.formatId("1234"));

    }
}

 class Invoice implements Serializable{
    public static String formatId(String oldId) {
        return oldId + "_Invoice";
    }
}

 class SalesInvoice extends Invoice implements Serializable{
    public static String formatId(String oldId) {
        return oldId + "_SalesInvoice";
    }
}
