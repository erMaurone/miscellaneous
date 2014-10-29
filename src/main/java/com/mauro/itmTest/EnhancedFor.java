package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */
class EnhancedFor{
public static void main(String[] args){
    byte arr[]=new byte[]{2,3,4,5};
    for(final int i : getCharArray(arr))
        System.out.print(i+" ");
 }

static char[] getCharArray(byte[]arr){
    char[] carr=new char[4];
    int i=0;
    for(byte c : arr){
        carr[i]=(char)c++;
        i++;
    }
    return carr;
 }
}