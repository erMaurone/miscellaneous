package com.mauro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 25/09/2014
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class JavaMagTest {

    public static void add(String obj, List<String> target) {
             target.add(obj);
    }

    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>();
        add("1", strings);
        System.out.println("First element in the list:: " + strings.get(0));
    }
}
