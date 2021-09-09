package com.company.ui;

import com.company.ui.text.ErrorMessage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner input=new Scanner(System.in);

    public static int getInt(){
        int choice=0;
        try {
          choice=  input.nextInt();
        }catch (InputMismatchException err){
            System.out.println(ErrorMessage.INPUT_MISMATCH_EXCEPTION);
        }
        return choice;
    }
}
