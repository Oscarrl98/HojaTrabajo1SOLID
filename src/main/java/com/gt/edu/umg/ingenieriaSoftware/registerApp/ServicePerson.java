package com.gt.edu.umg.ingenieriaSoftware.registerApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ServicePerson {

    public ServicePerson() {
    }
@RequestMapping("/savePerson")
    public void SavePerson(@RequestParam String name, Person person) {
      PersonDao personDao= new PersonDao();
      personDao.savePerson(person,name);
    }

}