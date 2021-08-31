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


}
