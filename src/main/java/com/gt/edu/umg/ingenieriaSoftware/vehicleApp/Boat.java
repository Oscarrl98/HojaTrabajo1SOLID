package com.gt.edu.umg.ingenieriaSoftware.vehicleApp;

public class Boat extends VehicleWithoutWheels{


    public void moveForward() {
        System.out.println("Moviendo bote sin ruedas hacia adelante");
    }

    public void moveBackward() {
        System.out.println("No puedo moverme hacia atras");
    }
}
