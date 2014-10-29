package com.mauro;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 05/08/2014
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
public class Pet {
    protected String name;

    public Pet(String a_name) {
        name = a_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
