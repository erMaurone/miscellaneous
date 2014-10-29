package com.mauro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 24/09/2014
 * Time: 11:35
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {
    private Stack testStack;

    @Before
    public void setUp() throws Exception {
        testStack = new Stack();

    }

    @Test
    public void testPush() throws Exception {
        testStack.push("1");
        testStack.push("2");
        testStack.push("3");
        testStack.push("4");
        testStack.push("5");

        String [] strings = testStack.toString().split("-");
        assertEquals(5, strings.length);
    }

    @Test
    public void testPop() throws Exception {
        testStack.push("1");
        testStack.push("2");
        testStack.push("3");
        testStack.push("4");
        testStack.push("5");

        String [] strings = testStack.toString().split("-");
        assertEquals(5, strings.length);

        Object popped = testStack.pop();
        System.out.println("popped = " + (String) popped);

        strings = testStack.toString().split("-");
        assertEquals(4, strings.length);
    }
}
