package com.company.vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle  {

    protected String model;
    protected int maxPassengers;

    public Vehicle(String model, int maxPassengers) {
        this.model = model;
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getModel() {
        return model;
    }

    public abstract int acceleration(int horsePower);

    public abstract int deceleration(int horsePower);

    public abstract int coast();

    public abstract void addPassenger(String name, int weight);

    public abstract void generatePassengers(int numOfPassengers);

    public abstract void removePassenger(String name);

    public abstract void horn();

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", maxPassengers=" + maxPassengers +
                '}';
    }


}
