package com.company;

import com.company.vehicles.Car;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Car sportCar = new Car(100,"SportsCar",2, 2300);
        Car nascar=new Car(100,"Nascar",1,3400);
        Car indyCar=new Car(100,"IndyCar",1,1620);
        Car rallyCar=new Car(100,"RallyCar",2,2600);

        indyCar.turnOn();
        indyCar.generatePassengers(2);

        System.out.println(indyCar.toString());

    }
}
