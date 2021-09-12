package com.company.ui;

import com.company.ui.text.ErrorMessage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static int getInt(){
        Scanner input=new Scanner(System.in);
        int choice=0;
            try {
                System.out.print("==>");
                choice = input.nextInt();
            } catch (InputMismatchException err) {
                System.out.println(ErrorMessage.INPUT_MISMATCH_EXCEPTION);
                getInt();
            }

        return choice;
    }
}
