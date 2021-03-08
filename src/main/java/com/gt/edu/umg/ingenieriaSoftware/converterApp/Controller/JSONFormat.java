package com.gt.edu.umg.ingenieriaSoftware.converterApp.Controller;

import java.util.*;

/**
 * 
 */
public class JSONFormat implements IFormat {

    public JSONFormat() {
    }

    public String convert(String word) {
        // TODO implement here
        return " \"palabra\":"+"\""+word+"\"";
    }

}