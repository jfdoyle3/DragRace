package com.company.vehicles.engine;

public class Gas extends Engine {

    private int tankSize;

    public Gas(int horsePower, int maxSpeed, int tankSize) {
        super(horsePower, maxSpeed);
        this.tankSize = tankSize;
    }

    @Override
    public void flipSwitch() {
        isRunning=!isRunning;
    }
}
