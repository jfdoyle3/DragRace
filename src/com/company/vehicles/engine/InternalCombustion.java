package com.company.vehicles.engine;

public class InternalCombustion extends Engine {

    private int tankSize;

    public InternalCombustion(int horsePower, int maxSpeed, int tankSize) {
        super(horsePower, maxSpeed);
        this.tankSize = tankSize;
    }

    @Override
    public void flipSwitch() {
        isRunning=!isRunning;
    }
}
