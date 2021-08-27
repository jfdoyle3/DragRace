package com.company.vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle extends Engine {

    protected String model;
    protected String brand;
    protected String manufacture;
    protected boolean isAutomatic;
    protected int maxPassengers;
    protected List<Passenger> passengers;

    public Vehicle(int numberOfCylinders,
                   boolean isRunning,
                   String model,
                   String brand,
                   String manufacture,
                   int doors,
                   boolean isAutomatic,
                   int maxPassengers) {
        super(numberOfCylinders, isRunning);
        this.model = model;
        this.brand = brand;
        this.manufacture = manufacture;
        this.isAutomatic = isAutomatic;
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(String name) {
        passengers.add(new Passenger(name));
    }

    public void addPassenger(int numOfPassengers) {
        for (int idx = 0; idx < numOfPassengers; idx++) {
            StringBuilder pass = new StringBuilder();
            pass.append("Passenger ").append(idx + 1);
            passengers.add(new Passenger(pass.toString()));
        }
        System.out.println(passengers.size() + " Passengers have been added to list");
    }

    // TODO: need to fix if name isn't found.
    public void removePassenger(String name) {
        int found = 0;
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name))
                found = passengers.indexOf(passenger);
        }
        if (found == -1) {
            System.out.println("Not Found");
            return;
        }
        System.out.println(name + " found and removed from list");
        passengers.remove(found);
    }

    public int getPassengersListSize() {
        return passengers.size();
    }

    public void displayPassengerList() {
        System.out.println("Current List of Passengers:");
        for (Passenger passenger : passengers)
            System.out.println(passenger);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", isAutomatic=" + isAutomatic +
                super.numberOfCylinders + super.isRunning +
                '}';
    }

    public abstract void horn();

    public abstract void turnOn();

    public abstract void turnOff();
}
