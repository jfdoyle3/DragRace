package com.company.vehicles.engine;

public class Electric extends Engine{

    private int lengthOfCharge;

    public Electric(int horsePower, int maxSpeed, int lengthOfCharge) {
        super(horsePower, maxSpeed);
        this.lengthOfCharge = lengthOfCharge;
    }

    @Override
    public void flipSwitch() {
        isRunning=!isRunning;
    }
}
