package com.gt.edu.umg.ingenieriaSoftwares.registerappS;

public class PersonDao implements IDao{


    public PersonDao() {
    }

    @Override
    public void save(Object object,String name) {
        System.out.println("Registro de persona guardado correctamente con ID: ");//+person.getName());

    }



}