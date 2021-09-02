package com.company;

import com.company.vehicles.Car;
import com.company.vehicles.engine.Engine;
import com.company.vehicles.engine.InternalCombustion;

public class DragStrip {


    public static void pitArea() {

        // int selectCar=Console.selectCar();
        // int selectEngine=Console.selectEngine();
        InternalCombustion gasPowered = new InternalCombustion("V8", 760, 190);
        Car car = new Car("GT500", 4, 4171, gasPowered, 16);
        car.generatePassengers(4);
        System.out.println(car.toString());

    }


    public static void race(){
        InternalCombustion gasPowered = new InternalCombustion("V8", 760, 190);
        Car car = new Car("GT500", 4, 4171, gasPowered, 16);
        car.generatePassengers(4);
        System.out.println(car.toString());
        int speed, mileageTraveling, turn, totalMileage, horsePower, weight, gasTank, maxSpeed,maxHorsePower;

        horsePower = 280;
        turn = 0;
        totalMileage = 500;
        mileageTraveling = 0;
        speed = 0;
        while(true) {
            int choice = Console.dashboard(car.getModel(), mileageTraveling, speed, totalMileage, turn);
            switch (choice) {
                case 1:
                    accelerate();
                    break;
                case 2:
                    System.out.println("coast");
                    break;
                case 3:
                    System.out.println("decel");
                    break;
                case 99:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid selection");

            }
        }

    }

    private static void accelerate() {

    }
}




