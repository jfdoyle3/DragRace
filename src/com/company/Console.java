package com.company;


import java.util.Scanner;

public class Console {
    private static Scanner input = new Scanner(System.in);

    // use color Ansi for car color
    public void track() {
        System.out.println("....|....|....|....|....|....|....||");
        System.out.println("C1");
    }


    public static int selectCar() {
        System.out.println("Select Car:\n1. Roadster\n2. Sport");
        System.out.print("==>");
        int choice = input.nextInt();
        return choice;
    }

    public static int selectEngine() {
        System.out.println("Select Engine:\n1. Internal Combustion\n2. Electric");
        System.out.print("==>");
        int choice = input.nextInt();
        return choice;
    }

    public static int dashboard(String car) {
        System.out.println("Car: " + car + "\tLocation: 0\tSpeed: 0\tDestination: 2500\tTime Passed: 0");
        System.out.println("1. Accelerate\n2. Coast\n3. Decelerate");
        System.out.print("==>");
        int choice = input.nextInt();
        return choice;

    }
}
