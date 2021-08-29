package com.company;

import com.company.vehicles.land.Car;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Car car = new Car(8, false, "Dat-240Z", "240Z", "Datsun", 2, 2);
        car.generatePassengers(5);
        car.displayPassengerList();

        System.out.println(car.toString());

    }
}
