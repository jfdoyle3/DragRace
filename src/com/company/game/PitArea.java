package com.company.game;

import com.company.ui.UI;
import com.company.vehicles.Car;
import com.company.vehicles.engine.Engine;
import com.company.vehicles.engine.InternalCombustion;

public class PitArea {

    public PitArea() {

        InternalCombustion gasPowered = null;
        Car car = null;
//        int selectCar= UI.selectCar();
//        int selectEngine= UI.selectEngine();
//        if(selectEngine==1)
        gasPowered = new InternalCombustion("V8", 760, 190, 100);
        //     if(selectCar==2)
        car = new Car("GT500", 4, 4171, gasPowered, 16);


        // car.generatePassengers(4);
        System.out.println(car.toString());
    }


}
