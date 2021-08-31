package com.company.vehicles.engine;

public class InternalCombustion extends Engine {

    private String model;
    public InternalCombustion(String model, int horsePower, int maxSpeed) {
        super(horsePower, maxSpeed);
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void flipSwitch() {
        isRunning=!isRunning;
    }

    @Override
    public String toString() {
        return "InternalCombustion:" +
                "\nmodel='" + model + '\'' +
                "\nisRunning=" + isRunning +
                "\nhorsePower=" + horsePower +
                "\nmaxSpeed=" + maxSpeed +
                "\nmph=" + mph;
    }
}
