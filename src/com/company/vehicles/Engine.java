package com.company.vehicles;

public abstract class Engine {


    protected boolean isRunning;
    protected int horsePower;
    protected int maxSpeed;
    protected int mph;

    public Engine(int horsePower) {
        this.isRunning = false;
        this.horsePower = horsePower;
        this.mph=0;
    }


    protected void flipSwitch(){
        this.isRunning=!isRunning;

    }

    public abstract void accelerate();
    public abstract void coast();
    public abstract void decelerate();

    @Override
    public String toString() {
        return "Engine{" +
                "isRunning=" + isRunning +
                ", horsePower=" + horsePower +
                ", mph="+mph+
                '}';
    }
}
