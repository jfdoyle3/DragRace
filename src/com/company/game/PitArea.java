package com.company.game;

import com.company.ui.UI;
import com.company.vehicles.Car;
import com.company.vehicles.engine.Electric;
import com.company.vehicles.engine.Engine;
import com.company.vehicles.engine.InternalCombustion;

import java.util.ArrayList;
import java.util.List;

public class PitArea {

    public static void carSelection() {
        List<Car> cars = new ArrayList<>();
        List<Engine> engines=new ArrayList<>();



        int selectCar = UI.selectCar();
        int selectEngine = UI.selectEngine();

        InternalCombustion    gasPoweredV8 = new InternalCombustion("V8", 760, 190, 100);
        InternalCombustion    gasPoweredV12 = new InternalCombustion("V12", 760, 190, 100);
        Electric electricPowered=new Electric(100,150,100,8);
        engines.add(gasPoweredV8);
        engines.add(gasPoweredV12);
        engines.add(electricPowered);
        Car car = new Car("GT500", 4, 4171, engines.get(selectEngine-1), 16);
        car.generatePassengers(4);
        cars.add(car);


        System.out.println(selectCar+" "+selectEngine+"\n"+car);
    }


}
