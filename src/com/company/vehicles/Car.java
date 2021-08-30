package com.company.vehicles;

import com.company.vehicles.Passenger;
import com.company.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    private List<Passenger> carPassengers;
    private int weight;
    private int totalWeight;

    // max speed?
    public Car(int horsePower, String model, int maxPassengers, int weight) {
        super(horsePower, model, maxPassengers);
        this.weight = weight;
        this.carPassengers = new ArrayList<>();
    }

    public void addPassenger(String name, int weight) {
        carPassengers.add(new Passenger(name, weight));
    }


    // weight avg 137
    // weight 100 - 220
    public void generatePassengers(int numOfPassengers) {
        int upperBound = 220;
        int lowerBound = 100;

        if (numOfPassengers>=maxPassengers)
            numOfPassengers=maxPassengers;
         else
            numOfPassengers=1;

        for (int idx = 0; idx < numOfPassengers; idx++) {
            StringBuilder pass = new StringBuilder();
            if(idx==0)
                pass.append("Driver");
            else
                pass.append("Passenger ").append(idx) ;

            int number = lowerBound + (int) (Math.random() * ((upperBound - lowerBound) + 1));
            carPassengers.add(new Passenger(pass.toString(), number));
        }
        System.out.println(carPassengers.size() + " Passengers are in the car");
    }

    public void removePassenger(String name) {
        int found = 0;
        for (Passenger passenger : carPassengers) {
            if (passenger.getName().equals(name))
                found = carPassengers.indexOf(passenger);
        }
        System.out.println(name + " found and removed from list");
        carPassengers.remove(found);
    }


    public int getTotalWeight(){
        for (Passenger passenger : carPassengers)
            totalWeight+=passenger.getWeight();
        totalWeight+=weight;
        return totalWeight;
    }

    @Override
    public void horn() {
        System.out.println("Beep!");
    }

    @Override
    public void turnOn() {
        flipSwitch();
    }

    @Override
    public void turnOff() {
        flipSwitch();
    }


    @Override
    public void accelerate() {

    }

    @Override
    public void coast() {
    }

    @Override
    public void decelerate() {
    }

    @Override
    public String toString() {
        return "Car:" +
                "\nmodel='" + model + '\'' +
                "\nisRunning=" + isRunning +
                "\nweight="+weight+
                "\nmaxPassengers=" + maxPassengers +
                "\ncarPassengers=" + carPassengers +
                "\nOccupants & Car weight="+this.getTotalWeight();
    }


}


