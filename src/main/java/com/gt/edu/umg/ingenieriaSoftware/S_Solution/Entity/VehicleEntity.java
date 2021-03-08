package com.gt.edu.umg.ingenieriaSoftware.S_Solution.Entity;

import java.util.*;

/**
 * 
 */
public abstract class VehicleEntity {

    /**
     * Default constructor
     */
    public VehicleEntity() {
    }

    /**
     * 
     */
    public String Brand;

    /**
     * 
     */
    public String Color;

    /**
     * 
     */
    public Number PlateNumber;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Number getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(Number plateNumber) {
        PlateNumber = plateNumber;
    }
}