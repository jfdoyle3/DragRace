package com.company.game;

import com.company.ui.UI;
import com.company.vehicles.Car;
import com.company.vehicles.engine.InternalCombustion;

public class DragStrip {

    public static void race() {
        InternalCombustion gasPowered = new InternalCombustion("V8", 70, 190, 100);
        Car car = new Car("GT500", 4, 4171, gasPowered, 16);
        car.generatePassengers(4);
      //  System.out.println(car.toString());

        int speed, mileageTraveling, turn, totalMileage, horsePower, weight, gasTank, maxSpeed, maxHorsePower;
        horsePower = 0;
        turn = 0;
        totalMileage = 2500;
        mileageTraveling = 0;
        speed = 0;

        while (true) {
            int choice = UI.dashboard(car.getModel(), mileageTraveling, speed, totalMileage, turn);
            switch (choice) {
                case 1:
                    speed=accelerate(car);
                    break;
                case 2:
                    speed=coast(car);
                    break;
                case 3:
                    speed=decelerate(car);
                    break;
                case 99:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid selection");
            }
            turn++;
            mileageTraveling += speed;
            if(mileageTraveling>=totalMileage){
                UI.raceStatus(car.getModel(), mileageTraveling, speed, totalMileage, turn);
                System.out.println("End Race");
                break;
            }
        }

    }

    private static int accelerate(Car car) {
        return car.acceleration(car.getEngine().getAccelerationRate());
    }

    private static int coast(Car car){
        return car.coast();
    }

    private static int decelerate(Car car){
        return car.deceleration(car.getEngine().getAccelerationRate());
    }

}




