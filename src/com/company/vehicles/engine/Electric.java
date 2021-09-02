package com.company.vehicles.engine;

public class Electric extends Engine{

    private int lengthOfCharge;

    public Electric(int maxHorsePower, int maxSpeed, int accelerationRate, int lengthOfCharge) {
        super(maxHorsePower, maxSpeed, accelerationRate);
        this.lengthOfCharge = lengthOfCharge;
    }



    @Override
    public void flipSwitch() {
        isRunning=!isRunning;
    }
}
