package com.company;


import com.company.game.DragStrip;
import com.company.game.PitArea;
import com.company.vehicles.Car;

public class Main {


    public static void main(String[] args) {

        Car raceCar=PitArea.carSelection();
        DragStrip.race(raceCar);

    }
}
