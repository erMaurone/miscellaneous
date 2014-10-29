package com.mauro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 24/09/2014
 * Time: 11:04
 * To change this template use File | Settings | File Templates.
 */
public class SetgViewOfMap {

    public static void main(String[] args) {
        Map<String, String> basicStructure = new HashMap<>();

        basicStructure.put("key1", "value1");
        basicStructure.put("key2", "value2");
        basicStructure.put("key3", "value3");
        basicStructure.put("key4", "value4");
        basicStructure.put("key5", "value5");
        basicStructure.put("key6", "value6");

        printMap(basicStructure);

        Set mapAsKeySet = basicStructure.keySet();


        Iterator it = mapAsKeySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (key.equals("key4"))
                it.remove();
        }
         printMap(basicStructure);
    }

    public static void printMap(Map<String, String> aMap) {
        System.out.println("printing map, size = " + aMap.size());
        for (Map.Entry<String, String> entry : aMap.entrySet() ) {
            System.out.println("key = " + entry.getKey() +
                    "; value = " + entry.getValue());
        }
        System.out.println();
    }
}
