package com.company.game;

import com.company.ui.UI;
import com.company.vehicles.Car;
import com.company.vehicles.engine.Engine;
import com.company.vehicles.engine.InternalCombustion;

import java.util.ArrayList;
import java.util.List;

public class PitArea {

    public PitArea() {
        List<Car> cars=new ArrayList<>();
        InternalCombustion gasPowered = null;
        Car car = null;
//        int selectCar= UI.selectCar();
//        int selectEngine= UI.selectEngine();
//        if(selectEngine==1)
        gasPowered = new InternalCombustion("V8", 760, 190, 100);
        //     if(selectCar==2)
        car = new Car("GT500", 4, 4171, gasPowered, 16);
        cars.add(car);

        // car.generatePassengers(4);
        System.out.println(car.toString());
    }


}
