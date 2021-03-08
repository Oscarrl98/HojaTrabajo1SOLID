package com.gt.edu.umg.ingenieriaSoftware.converterApp.Controller;

import java.util.*;

/**
 * 
 */
public class XMLFormat implements IFormat {

    public XMLFormat() {
    }

    public String convert(String word) {
        // TODO implement here
        return "<palabra>"+word+"</palabra>";
    }

}