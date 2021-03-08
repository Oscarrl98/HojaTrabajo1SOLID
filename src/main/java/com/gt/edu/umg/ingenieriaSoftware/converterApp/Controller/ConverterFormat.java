package com.gt.edu.umg.ingenieriaSoftware.converterApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
public class ConverterFormat {
    @RequestMapping("/convert")
    public void convertir(@RequestParam String word){
        ConverterFormat con = new ConverterFormat();
        System.out.println("LA CADENA DN FORMATO HTML "+this.convertFormat(word,new HTMLFormat()));
        System.out.println("LA CADENA DN FORMATO JSON "+this.convertFormat(word,new JSONFormat()));
        System.out.println("LA CADENA DN FORMATO CSV "+this.convertFormat(word,new CSVFormat()));
        System.out.println("LA CADENA DN FORMATO XML "+this.convertFormat(word,new XMLFormat()));
        System.out.println("LA CADENA SIN FORMATO "+this.convertFormat(word,new SimpleFormat()));
    }

    public String convertFormat(String word, IFormat format) {

        return format.convert(word);
    }

}