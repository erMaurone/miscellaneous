package com.mauro;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 30/07/2014
 * Time: 19:39
 * To change this template use File | Settings | File Templates.
 */
public class Dog extends Pet {

    private int age;

    public Dog(String a_name) {
        super(a_name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}