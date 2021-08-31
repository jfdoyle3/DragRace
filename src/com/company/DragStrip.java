package com.company;

import com.company.vehicles.Car;
import com.company.vehicles.engine.InternalCombustion;

public class DragStrip {
    private static Car roadster;
    private static Car sport;
    private static Car car;


    public static void pitArea() {

       int selectCar=Console.selectCar();
       if(selectCar==1)
           car=new Car(100,200,"Cobra",2,2000,new InternalCombustion(100,200,10));
       else
           car=new Car(100,200,"Mustang",4,2100,new InternalCombustion(100,200,10));

        System.out.println(car.toString());
        Console.selectEngine();
        Console.dashboard("cobra");
    }
}
