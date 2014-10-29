package com.mauro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 14/10/2014
 * Time: 10:47
 * To change this template use File | Settings | File Templates.
 */
public class DateParserJava8 {

    private static final String DATE_FORMAT = "dd-MMM-yyyy";

    public static void main(String[] args)  {
        java.time.LocalDate aDate = LocalDate.parse(args[0],
                DateTimeFormatter.ofPattern(DATE_FORMAT));
        System.out.println(aDate.toString());
    }

    public static void printUsageMessage() {
        System.out.println("Usage: DateParsing " + DATE_FORMAT);
    }
}
