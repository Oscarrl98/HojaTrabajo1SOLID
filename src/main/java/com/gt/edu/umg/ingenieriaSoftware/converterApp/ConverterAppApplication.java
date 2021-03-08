package com.gt.edu.umg.ingenieriaSoftware.converterApp;

import com.gt.edu.umg.ingenieriaSoftware.converterApp.Controller.ConverterFormat;
import com.gt.edu.umg.ingenieriaSoftware.converterApp.Controller.HTMLFormat;
import com.gt.edu.umg.ingenieriaSoftware.converterApp.Controller.IFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConverterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverterAppApplication.class, args);
	}
    ConverterFormat format = new ConverterFormat();



}
