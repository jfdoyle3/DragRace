package com.company.game;

import com.company.ui.UI;
import com.company.vehicles.Car;
import com.company.vehicles.engine.Electric;
import com.company.vehicles.engine.Engine;
import com.company.vehicles.engine.InternalCombustion;

import java.util.ArrayList;
import java.util.List;

public class PitArea {

//    private Car car;
//    private Engine engine;

    public static Car carSelection() {

        List<Car> cars = new ArrayList<>();
        List<Engine> engines = new ArrayList<>();


        int selectCar = UI.selectCar();
        int selectEngine = UI.selectEngine();


        InternalCombustion gasPoweredV8 = new InternalCombustion("V8", 760, 190, 100, 16);
        Electric electricPowered = new Electric("100kWh",778, 155, 100, 367);

        engines.add(gasPoweredV8);
        engines.add(electricPowered);

        Car sport = new Car("Sport", 4, 4171, engines.get(selectEngine - 1));
        Car roadster = new Car("Roadster", 2, 4998, engines.get(selectEngine - 1));

        sport.generatePassengers(sport.getMaxPassengers());
        roadster.generatePassengers(roadster.getMaxPassengers());

        cars.add(roadster);
        cars.add(sport);


     //   System.out.println(cars.get(selectCar - 1).displayCar());
        return cars.get(selectCar - 1);
    }


}
