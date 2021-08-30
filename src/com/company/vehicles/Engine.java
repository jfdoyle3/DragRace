package com.company.vehicles;

public abstract class Engine {


    protected boolean isRunning;
    protected int horsePower;
    protected int maxSpeed;
    protected int mph;

    public Engine(int horsePower, int maxSpeed) {
        this.isRunning = false;
        this.maxSpeed=maxSpeed;
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
        return "Engine:" +
                "\nisRunning=" + isRunning +
                "\nhorsePower=" + horsePower +
                "\nMax Speed= "+maxSpeed+
                "\ncurrent speed="+mph;
    }
}
