package com.company.vehicles.engine;

public abstract class Engine implements EngineActions {

    protected boolean isRunning;
    protected int maxHorsePower;
    protected int maxSpeed;
    protected int accelerationRate;

    public Engine(int maxHorsePower, int maxSpeed, int accelerationRate) {
        this.isRunning = false;
        this.maxSpeed = maxSpeed;
        this.maxHorsePower = maxHorsePower;
        this.accelerationRate=accelerationRate;
    }

    public int getAccelerationRate() {
        return accelerationRate;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getMaxHorsePower() {
        return maxHorsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
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
