package com.mauro.itmTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:49
 * To change this template use File | Settings | File Templates.
 */
public class LocalVars {

    public static void main(String [] args) {
            String parm2 = "UTF-16";
        Locale parm1 = Locale.ENGLISH;
        Map<String, Integer> names = Calendar.getInstance().getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, parm1);
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            Writer out = new OutputStreamWriter(fos, parm2);
            out.write(names.toString());
            out.close();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
