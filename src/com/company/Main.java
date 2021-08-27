package com.company;

import com.company.vehicles.land.Car;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Car car = new Car(8, false, "Dat-240Z", "240Z", "Datsun", 2, false, 2);
        car.addPassenger(5);
        car.displayPassengerList();
        car.removePassenger("Passenger 20");
        car.displayPassengerList();
        System.out.println(car.toString());

    }
}
