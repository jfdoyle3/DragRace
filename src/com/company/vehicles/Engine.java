package com.company.vehicles;

public abstract class Engine {


    protected boolean isRunning;
    protected int horsePower;
    protected int maxSpeed;

    public Engine( boolean isRunning, int horsePower, int maxSpeed) {
        this.isRunning = false;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }


    protected void flipSwitch(){
        final boolean flip = this.isRunning ? true : false;

    }

    public abstract void accelerate();
    public abstract void coast();
    public abstract void decelerate();

    @Override
    public String toString() {
        return "Engine{" +
                "isRunning=" + isRunning +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
