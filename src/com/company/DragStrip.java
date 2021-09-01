package com.company;

import com.company.vehicles.Car;
import com.company.vehicles.engine.Engine;
import com.company.vehicles.engine.InternalCombustion;

public class DragStrip {



    public static void pitArea() {

      // int selectCar=Console.selectCar();
      // int selectEngine=Console.selectEngine();
       InternalCombustion gasPowered=new InternalCombustion("V8",100,200);
       Car car=new Car("Cobra",2,2000,gasPowered,20);
       car.generatePassengers(2);
       System.out.println(car.toString());
       Console.dashboard(car.getModel(),15,25,85,100);
    }

    public static void race(){
        int speed,milageTraveling,turns,totalMilage;

        speed=0;
        turns=0;
        totalMilage=500;
        milageTraveling=0;
        //Constant: milestraveling+=speed - after menu choice ,car is always moving

        //  acc.
        //* speed +=horsepower/4 [(- totalweight(persons)/2000)]
        //* speed !> max speed
        // gas used
        // turn/time ++


        // coast
        //* speed remain same . think of weight as a factor slowing down
        // can gradually slow down weight
        // turn ++
        // gas remains

        // decel
        //* speed -- split in half or set decel increament (ask)
        // maybe think of weight to increase rate of decel
        // gas remains
        //* speed !< 0 - 0 is stop.
        // turn ++;



    }


}