package com.company.vehicles.engine;

public abstract class Engine {

    protected boolean isRunning;
    protected int maxHorsePower;
    protected int maxSpeed;
    protected int accelerationRate;

    public Engine(int maxHorsePower, int maxSpeed) {
        this.isRunning = false;
        this.maxSpeed = maxSpeed;
        this.maxHorsePower = maxHorsePower;
        this.accelerationRate=100;
    }


    public abstract void flipSwitch();

    public int getAccelerationRate() {
        return accelerationRate;
    }


    @Override
    public String toString() {
        return "Engine:" +
                "\nisRunning=" + isRunning +
                "\nhorsePower=" + maxHorsePower +
                "\nMax Speed= " + maxSpeed +
                "\nAcceleration Rate=" + accelerationRate;
    }
}
