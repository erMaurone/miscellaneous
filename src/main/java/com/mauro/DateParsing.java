package com.mauro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 14/10/2014
 * Time: 10:25
 * To change this template use File | Settings | File Templates.
 */
public class DateParsing {

    private static final String DATE_FORMAT = "dd-MMM-yyyy";

    public static void main(String args[]) {
        if (args.length != 1)
            printUsageMessage();

        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        try {
            Date aDate = dateFormat.parse(args[0]);
            System.out.println("date is " + aDate.toString());
        } catch (ParseException e) {
            printUsageMessage();
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static void printUsageMessage() {
        System.out.println("Usage: DateParsing " + DATE_FORMAT);
    }
}
