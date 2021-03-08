package com.gt.edu.umg.ingenieriaSoftware.converterApp.Controller;

import java.util.*;

/**
 * 
 */
public class CSVFormat implements IFormat {

    public CSVFormat() {
    }

    public String convert(String word) {
        // TODO implement here
        return ","+word+",";
    }

}