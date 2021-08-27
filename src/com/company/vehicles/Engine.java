package com.company.vehicles;

public abstract class Engine {

    protected int numberOfCylinders;
    protected boolean isRunning;

    public Engine(int numberOfCylinders, boolean isRunning) {
        this.numberOfCylinders = numberOfCylinders;
        this.isRunning = isRunning;
    }

    protected void flipSwitch(){
        boolean flip=isRunning ? true : false;

    }
    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                ", isRunning=" + isRunning +
                '}';
    }
}
