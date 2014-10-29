package com.mauro;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 24/09/2014
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result =  elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        for (Object obj : elements)
            if (obj != null)
                result.append( obj +"-");
        return result.toString();
    }
}
