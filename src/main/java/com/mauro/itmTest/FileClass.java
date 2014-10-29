package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
public class  FileClass{
    public static void main(String[] args){
        File file = new File("test.txt");
        File backup = new File("test.txt.bak");
        backup.delete();
        file.renameTo(backup); //Location 1
    }
}