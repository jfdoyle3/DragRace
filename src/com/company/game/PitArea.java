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
        // List Cars & Engines
        List<Car> cars = new ArrayList<>();
        List<Engine> engines=new ArrayList<>();

        //Select Cars (1,2) & Engines(Gas:1,2 Electric:3,4)
        int selectCar = UI.selectCar();
        int selectEngine = UI.selectEngine();
        System.out.println("--------------------------------------> "+selectCar+" |--------> "+selectEngine);

        InternalCombustion    gasPoweredV8 = new InternalCombustion("V8", 760, 190, 100);
        Electric electricPowered=new Electric(100,150,100,8);

        engines.add(gasPoweredV8);
        engines.add(electricPowered);



        Car car = new Car("Sports", 4, 4171, engines.get(selectEngine-1), 16);
        Car car2=new Car("Roadster",3,333,engines.get(selectEngine-1),12);

        // Generate passengers (Optional)
        car.generatePassengers(4);
        car2.generatePassengers(3);

        // Add Car to list.
        cars.add(car);
        cars.add(car2);

        System.out.println(cars.get(selectCar-1));
    }


}
