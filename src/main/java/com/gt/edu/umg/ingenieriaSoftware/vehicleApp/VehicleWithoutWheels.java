package com.gt.edu.umg.ingenieriaSoftware.vehicleApp;

public class VehicleWithoutWheels  extends Vehicle{
    public void TurnOn() {
        System.out.println("Arrancando vehiculo");
    }

    public void moveForward() {
        System.out.println("Moviendo hacia adelante sin ruedas");
    }

    public void moveBackward() {
        System.out.println("Moviendo hacia atras sin ruedas");
    }
}
