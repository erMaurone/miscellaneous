package com.mauro;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 05/08/2014
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
public class ArraySubType {

    public static void Main(String argv[]) {


        Dog aDog = new Dog("dogName");
        Dog secondDog = new Dog("secondDog");
        Dog thirdDog = new Dog("thirdDog");


        Pet[] aPetArray = {aDog, secondDog, thirdDog};
        Dog[] aDogArray = {aDog, secondDog, thirdDog};

        Pet[] mixedArray = new Pet[3];
        mixedArray[0] = new Dog("anotherDog");
        mixedArray[1] = new Pet("aPet");
        mixedArray[2] = secondDog;

        aPetArray = aDogArray;
        //aPetArray = new int[4];      //will show error


    }


}
