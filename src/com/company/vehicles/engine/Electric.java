package com.company.vehicles.engine;

public class Electric extends Engine{

    private int lengthOfCharge;

    public Electric(int maxHorsePower, int maxSpeed, int accelerationRate, int lengthOfCharge) {
        super(maxHorsePower, maxSpeed, accelerationRate);
        this.lengthOfCharge = lengthOfCharge;
    }

    @Override
    public void engineTurnOnOff() {
        isRunning=!isRunning;

    }

    @Override
    public void displayEngineState() {
        String displayStatus=(!isRunning) ?  "Off":"On";
        System.out.println("Electric Engine is "+displayStatus);
    }

    @Override
    public String toString() {
        return "Electric{" +
                "lengthOfCharge=" + lengthOfCharge +
                ", isRunning=" + isRunning +
                ", maxHorsePower=" + maxHorsePower +
                ", maxSpeed=" + maxSpeed +
                ", accelerationRate=" + accelerationRate +
                '}';
    }

    @Override
    public String displayEngine() {
        return "Electric{" +
                "lengthOfCharge=" + lengthOfCharge +
                ", maxHorsePower=" + maxHorsePower +
                ", maxSpeed=" + maxSpeed +
                ", accelerationRate=" + accelerationRate +
                '}';
    }
}
