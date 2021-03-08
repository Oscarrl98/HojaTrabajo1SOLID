package com.gt.edu.umg.ingenieriaSoftware.registerApp;

public class PersonDao {


    public PersonDao() {
    }

    public void savePerson(Person person,String name) {
        person.setName(name);
        System.out.println("Registro de persona guardado correctamente con ID: "+person.getName());
    }

}