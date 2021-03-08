package com.gt.edu.umg.ingenieriaSoftware.S_Solution.Controller;

import com.gt.edu.umg.ingenieriaSoftware.S_Solution.Entity.CarEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 
 */
@RestController
public class WorkShopController {

    public WorkShopController() {

    }
    public String CheckBrakes(CarEntity car) {
        return null;
    }

    public String CheckEngine(CarEntity car) {
        return null;
    }

    public String WashCar(CarEntity car) {
        return "Se ha lavado el vehiculo con numero de placa "+car.getPlateNumber();
    }

    @GetMapping("/deliverCar")
    public void DeliverCar(CarEntity car) {
        System.out.println("Aqui tiene su vehiculo,Gracias Por usar nuestros servicios");
    }
    @GetMapping("/collectMoney")
    public void CollectServices(String vehiculo) {

    }
    @GetMapping("/newCar")
    public void RecibeCar(@RequestParam int plateNumber) {
        System.out.println("Nueo Vehiculo Recibido");

        CarEntity car1=new CarEntity();
        car1.setPlateNumber(plateNumber);

        this.WashCar(car1);
    }


}