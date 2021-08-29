package com.company.vehicles;

public class Passenger {

    // weight avg 137
    // weight 100 - 200
    private String name;
    private int weight;

    public Passenger(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
