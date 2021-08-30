package com.company.vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle extends Engine  {

    protected String model;
    protected int maxPassengers;

    public Vehicle(int horsePower, int maxSpeed,String model, int maxPassengers) {
        super(horsePower,maxSpeed);
        this.model = model;
        this.maxPassengers = maxPassengers;
    }


    public abstract void addPassenger(String name, int weight);

    public abstract void generatePassengers(int numOfPassengers);

    public abstract void removePassenger(String name);

    public abstract void horn();

    public abstract void turnOn();

    public abstract void turnOff();





    @Override
    public String toString() {
        return "Vehicle:" +
                "\nmodel=" + model;

    }


}
