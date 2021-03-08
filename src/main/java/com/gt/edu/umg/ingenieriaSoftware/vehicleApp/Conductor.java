package com.gt.edu.umg.ingenieriaSoftware.vehicleApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Conductor {
    @RequestMapping("/mover")
    public void iniciar() throws Exception {
            this.moveForwardVehicle(new Vehicle());
            this.moveForwardVehicle(new Motorcycle());
            this.moveForwardVehicle(new ElectricCar());
            this.moveBackwardVehicle(new Motorcycle());
            this.moveForwardVehicle(new Boat());
            this.moveBackwardVehicle(new Boat());
    }

    public static void moveForwardVehicle( Vehicle vehicle)throws Exception{
        vehicle.moveForward();

    }
    public static void moveBackwardVehicle( Vehicle vehicle)throws Exception{
        vehicle.moveBackward();

    }
}
