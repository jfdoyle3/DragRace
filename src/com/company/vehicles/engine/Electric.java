package com.company.vehicles.engine;

public class Electric extends Engine{

    private int lengthOfCharge;
    private String model;

    public Electric(String model,int maxHorsePower, int maxSpeed, int accelerationRate, int lengthOfCharge) {
        super(maxHorsePower, maxSpeed, accelerationRate);
        this.model=model;
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
                "\nmodel='" + model + '\'' +
                "lengthOfCharge=" + lengthOfCharge +
                ", isRunning=" + isRunning +
                ", maxHorsePower=" + maxHorsePower +
                ", maxSpeed=" + maxSpeed +
                ", accelerationRate=" + accelerationRate +
                '}';
    }

    @Override
    public String displayEngine() {
        return "Electric:" +
                "\nModel: " + model+
                "\nlengthOfCharge=" + lengthOfCharge +
                "\nMax HorsePower=" + maxHorsePower +
                "\nMax Speed=" + maxSpeed +
                "\nAcceleration Rate: "+accelerationRate/4+" mph +/-";
    }
}
