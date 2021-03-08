package com.gt.edu.umg.ingenieriaSoftware.converterApp;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Converter {

    @GetMapping("/convertir")
    public String ConvertFormat(@RequestParam String word, @RequestParam String format) {
        switch (format) {
            case "HTML":return "html"+word+"html";
            case "XML": return "<palabra> "+word+" </palabra>";
            case "CSV": return ","+word+",";
            case "JSON":return " \"palabra\":"+"\""+word+"\"";
            case "Text":return word;
            default:
                return "ERROR: No existe formato ingresado";
        }
    }
}
