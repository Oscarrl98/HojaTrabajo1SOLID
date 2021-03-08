package com.gt.edu.umg.ingenieriaSoftware.S_Solution;

import com.gt.edu.umg.ingenieriaSoftware.S_Solution.Controller.WorkShopManagerController;
import com.gt.edu.umg.ingenieriaSoftware.S_Solution.Entity.CarEntity;
import com.gt.edu.umg.ingenieriaSoftware.S_Solution.Entity.VehicleEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SSolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SSolutionApplication.class, args);
		WorkShopManagerController manager = new WorkShopManagerController();
/*
		CarEntity car1= new CarEntity();
		manager.RecibeCar(car1);*/
	}

}
