package com.company;


import java.util.InputMismatchException;
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



    public static int selectEngine(){
        System.out.println("Select Engine:\nGas\t\tElectric\n1. V8\t3. 1000KV\n2. V12\t4. 1300KV");
        System.out.print("==>");
        int choice = input.nextInt();
        return choice;
    }

    public static int dashboard(String car, int miles, int speed, int destination, int time) {
        int choice;
        System.out.println("Car: " + car + "\tMiles: "+miles+"\tSpeed: "+speed+"\tDestination: "+destination+"\tTime Passed: "+time);
        System.out.println("1. Accelerate\n2. Coast\n3. Decelerate");
        System.out.print("==>");
       try {
             choice = input.nextInt();
        }catch (InputMismatchException err){
            System.out.println(err);
            choice=99;
        }
        return choice;

    }
}
