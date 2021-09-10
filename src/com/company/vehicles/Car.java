package com.company.vehicles;

import com.company.vehicles.engine.Engine;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    private List<Passenger> carPassengers;
    private int weight;
    private int totalWeight;
    private Engine engine;
    private int tankSize;
    private int speed=0;

    public Car(String model, int maxPassengers, int weight, Engine engine, int tankSize) {
        super(model, maxPassengers);
        this.carPassengers = new ArrayList<>();
        this.weight = weight;
        this.engine = engine;
        this.tankSize=tankSize;
    }


    public Engine getEngine() {
        return engine;
    }

    @Override
    public int acceleration(int horsePower) {
        //* speed +=horsepower/4 [(- totalWeight(persons)/2000)]
        speed += (horsePower / 4);// - (weight/2000);
        if(speed>=engine.getMaxSpeed())
            speed=engine.getMaxSpeed();
        return speed;
    }

    @Override
    public int deceleration(int horsePower) {
        speed -= (horsePower / 4);
        if(speed<=0)
            speed=0;
        return speed;
    }

    @Override
    public int coast() {
        return speed;
    }

    public void addPassenger(String name, int weight) {
        carPassengers.add(new Passenger(name, weight));
    }


    // weight avg 137
    // weight 100 - 220
    public void generatePassengers(int numOfPassengers) {
        int minWeight = 100;
        int maxWeight = 220;

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

            int weight = minWeight + (int) (Math.random() * ((maxWeight - minWeight) + 1));
            carPassengers.add(new Passenger(pass.toString(), weight));
        }
      //  System.out.println(carPassengers.size() + " Passengers are in the car");
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
    public String toString() {
        return "Car:" +
                "\nmodel='" + model + '\'' +
                "\nmaxPassengers=" + maxPassengers +
                "\ncarPassengers=" + carPassengers +
                "\nweight=" + weight +
                "\ntotalWeight=" + getTotalWeight()+
                "\ntankSize=" + tankSize+
                "\nEngine:\n" + engine.toString();
    }

    public String displayCar() {
        return "Car: "+
               "\nModel: " + model +
               "\nPassengers: " + carPassengers +
               "\nWeight: " + getTotalWeight()+" lbs (Car & Passengers)"+
                "\nTank Capacity: " + tankSize+" gals"+
                "\n--------------|Engine|----------------\n"
                +engine.displayEngine();
    }




}


