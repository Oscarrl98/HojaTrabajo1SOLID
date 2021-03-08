package com.gt.edu.umg.ingenieriaSoftware.S_Solution.Controller;

import com.gt.edu.umg.ingenieriaSoftware.S_Solution.Entity.CarEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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

}