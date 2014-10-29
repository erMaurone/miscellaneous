package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
class LISTDEMO {
    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add(0,"3");
        list.add(1,"4");
        System.out.println("list: "+list);
    }
}