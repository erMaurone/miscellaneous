package com.mauro;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 30/07/2014
 * Time: 19:25
 * To change this template use File | Settings | File Templates.
 */
public class ValueVsRef {

    private Dog myDog;


    public void misplaceDog(Dog aDog) {
        aDog = new Dog("FinDoMondu");
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;

    }

    public void renameDog(String aName) {
        myDog.setName(aName);
    }

    public String getMyDogName() {
        return myDog.getName();
    }

    public void publishMyDog() {

        System.out.println(myDog.getName());
    }
}
