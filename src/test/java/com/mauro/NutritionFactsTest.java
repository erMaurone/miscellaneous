package com.mauro;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 23/09/2014
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public class NutritionFactsTest {
    @Test
    public void testToString() throws Exception {
        NutritionFacts bananaNF = new NutritionFacts.Builder(240, 10)
                .calories(100).sodium(20).fat(20).carbohydrate(200).build();

        System.out.println("banana NF: " + bananaNF.toString());

        NutritionFacts appleNF = new NutritionFacts.Builder(20, 1)
                .carbohydrate(21).build();

        System.out.println("apple NF: " + appleNF.toString());

    }
}
