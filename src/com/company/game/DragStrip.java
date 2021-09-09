package com.company.game;

import com.company.ui.UI;
import com.company.vehicles.Car;
import com.company.vehicles.engine.InternalCombustion;

public class DragStrip {

    public static void race() {
        int speed, mileageTraveling, turn, totalMileage;
        turn = 0;
        mileageTraveling = 0;
        speed = 0;

        InternalCombustion gasPowered = new InternalCombustion("V8", 70, 190, 100);
        Car car = new Car("GT500", 4, 4171, gasPowered, 16);

        System.out.println("The max passengers for the "+car.getModel()+" is "+car.getMaxPassengers());
        int passengers=UI.setPassengers();
        if(passengers> car.getMaxPassengers())
            passengers=car.getMaxPassengers();
        if(passengers<=0)
            passengers=1;
        car.generatePassengers(passengers);

        totalMileage=UI.setTrackMileage();

        System.out.println("Welcome to Race Day\n-----------------------------\nThis Vehicle is racing today:");
        System.out.println(car.displayCar());
        System.out.println("-------------------------------------------\nCurrent status of the vehicle's engine:");
        car.getEngine().displayEngineState();
        System.out.println("\nLet the race begin!");


        while (true) {
            int choice = UI.dashboard(car.getModel(), mileageTraveling, speed, totalMileage, turn);
            if (choice != 4 && !car.getEngine().isRunning()) {
                choice = 88;
            }
            switch (choice) {
                case 1 -> speed = accelerate(car);
                case 2 -> speed = coast(car);
                case 3 -> speed = decelerate(car);
                case 4 -> {
                    car.getEngine().engineTurnOnOff();
                    car.getEngine().displayEngineState();
                }
                case 88 -> car.getEngine().displayEngineState();
                case 99 -> System.exit(0);
                default -> System.out.println("invalid selection");
            }
            turn++;
            mileageTraveling += speed;
            if (mileageTraveling >= totalMileage) {
                UI.raceStatus(car.getModel(), mileageTraveling, speed, totalMileage, turn);
                System.out.println("You went " + Math.abs(mileageTraveling - totalMileage) + " miles over the finish line.");
                break;
            }
            if (totalMileage == 0) {
                System.out.println("Perfect finish");
                break;
            }

        }

    }

    private static int accelerate(Car car) {
        return car.acceleration(car.getEngine().getAccelerationRate());
    }

    private static int coast(Car car) {
        return car.coast();
    }

    private static int decelerate(Car car) {
        return car.deceleration(car.getEngine().getAccelerationRate());
    }

}




