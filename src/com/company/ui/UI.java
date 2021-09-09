package com.company.ui;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    private static Scanner input = new Scanner(System.in);



    public static int selectCar() {
        System.out.println("Select Car:\n1. Roadster\n2. Sport");
        System.out.print("==>");
        int choice = input.nextInt();
        return choice;
    }

    public static int setTrackMileage(){
        System.out.println("How many miles is the raceway? ");
        int mileage=Input.getInt();
        return mileage;
    }


    public static int selectEngine(){
        System.out.println("Select Engine:\nGas\t\tElectric\n1. V8\t3. 1000KV\n2. V12\t4. 1300KV");
        System.out.print("==>");
        int choice = input.nextInt();
        return choice;
    }

    public static int dashboard(String car, int miles, int speed, int destination, int turn) {
        int choice=99;
        raceStatus(car, miles, speed, destination, turn);
        if(speed>0)
            System.out.println("1. Accelerate\n2. Coast\n3. Decelerate\n99. Quit");
        else
            System.out.println("1. Accelerate\n2. Coast\n3. Decelerate\n4. Start/Stop Engine\n99. Quit");
        System.out.print("==>");
       try {
             choice = input.nextInt();
        }catch (InputMismatchException err){
            System.out.println(ErrorMessage.INPUT_MISMATCH_EXCEPTION);
        }
        return choice;

    }

    public static void raceStatus(String car, int miles, int speed, int destination, int turn) {
        System.out.println("Car: " + car + "\tTraveled: "+ miles +" miles\tSpeed: "+ speed +" mph\tFinish Line: "+(destination - miles)+" miles\tTurn: "+ turn);
    }


}
