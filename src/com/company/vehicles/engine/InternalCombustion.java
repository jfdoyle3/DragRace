package com.company.vehicles.engine;

public class InternalCombustion extends Engine implements EngineActions {

    private String model;
    private int tankSize;

    public InternalCombustion(String model, int maxHorsePower, int maxSpeed, int accelerationRate,int tankSize) {
        super(maxHorsePower, maxSpeed, accelerationRate);
        this.model = model;
        this.tankSize=tankSize;
    }

    public String getModel() {
        return model;
    }



    @Override
    public void engineTurnOnOff() {
        isRunning=!isRunning;

    }

    @Override
    public void displayEngineState() {
        String displayStatus=(!isRunning) ?  "stopped":"running";
        System.out.println("Gas Engine is "+displayStatus);
    }

    @Override
    public String toString() {
        return "InternalCombustion:" +
                "\nmodel='" + model + '\'' +
                "\nisRunning=" + isRunning +
                "\nmaxHorsePower=" + maxHorsePower +
                "\nmaxSpeed=" + maxSpeed +
                "\ntankSize=" + tankSize+
                "\nacceleration Rate="+accelerationRate;
    }

    @Override
    public String displayEngine() {
        return "Gas Engine:"+
               "\nModel: " + model+
               "\nMax HorsePower: " + maxHorsePower +" hp"+
               "\nMax Speed: " + maxSpeed +" mph"+
                "\nTank Capacity: " + tankSize+" gals"+
               "\nAcceleration Rate: "+accelerationRate/4+" mph +/-";
    }

}
