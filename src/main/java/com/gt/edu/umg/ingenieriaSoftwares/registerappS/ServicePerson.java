package com.gt.edu.umg.ingenieriaSoftwares.registerappS;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.yaml.snakeyaml.events.Event;


@Controller
public class ServicePerson {
     private IDao idao;


    public ServicePerson() {
        this.idao=idao;
    }
@RequestMapping("/savePerson")
    public void SavePerson(@RequestParam String name, Person person)throws Exception  {
     idao.save(person,name);
    }

}