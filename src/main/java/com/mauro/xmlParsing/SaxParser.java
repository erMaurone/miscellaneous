package com.mauro.xmlParsing;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 10/10/2014
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class SaxParser {

    public static void main(String args[]) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try{
            XMLStreamReader reader =
                    factory.createXMLStreamReader(new FileReader("src/main/resources/config.xml"));
            while(reader.hasNext())
            {
                if(reader.getEventType() == XMLStreamReader.START_ELEMENT){
                    if (isRequiredElement(reader.getLocalName())) {
                        String elementText = reader.getElementText();
                        String elementName = reader.getLocalName();
                        printElement(elementName, elementText);
                    }
                }
                reader.next();
            }
        } catch(XMLStreamException xse) {
            System.out.println("Could not process xml file");
            xse.printStackTrace();
        } catch (FileNotFoundException ioe) {
            System.out.println("Could not open file");
            ioe.printStackTrace();
        }
    }

    public static boolean isRequiredElement(String element) {
        boolean isRequired = false;
        if(element.equals("name") ||
                element.equals("engine") ||
                element.equals("attribute") ) {
            isRequired = true;
        }
        return isRequired;
    }

    public static void printElement(String elementName, String elementText) {
        System.out.println( "  got " + elementName + " = "
                + elementText.substring(1,elementText.length()-1));
    }
}
