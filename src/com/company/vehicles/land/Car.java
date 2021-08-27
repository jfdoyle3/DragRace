package com.company.vehicles.land;

import com.company.vehicles.Passenger;
import com.company.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    private int doors;
    private List<Passenger> carPassengers;




    public Car(int numberOfCylinders, boolean isRunning, String model, String brand, String manufacture, int doors, boolean isAutomatic, int maxPassengers) {
        super(numberOfCylinders, isRunning, model, brand, manufacture, doors, isAutomatic,maxPassengers);
        this.doors=doors;
        this.carPassengers=new ArrayList<>();

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
    public String toString() {
        return "Car{" +
                "\nnumberOfCylinders=" + numberOfCylinders +
                "\nisRunning=" + isRunning +
                "\nmodel='" + model + '\'' +
                "\nbrand='" + brand + '\'' +
                "\nmanufacture='" + manufacture + '\'' +
                "\nisAutomatic=" + isAutomatic +
                "\nmaxPassengers=" + maxPassengers +
                "\npassengers=" + passengers +
                "\ndoors=" + doors +
                "\ncarPassengers=" + carPassengers +
                '}';
    }


}


