package com.gt.edu.umg.ingenieriaSoftware.vehicleApp;

import java.util.*;

public class Vehicle {

    public Vehicle() {
    }

    private int model;

    public void TurnOn() {
        System.out.println("Arrancando vehiculo");
    }

    public void moveForward() {
        System.out.println("Moviendo hacia adelante");
    }

    public void moveBackward() {
        System.out.println("Moviendo hacia atras");
    }

}