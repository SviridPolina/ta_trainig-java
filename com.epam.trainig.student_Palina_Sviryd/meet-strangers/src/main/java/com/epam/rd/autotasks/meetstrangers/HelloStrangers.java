package com.epam.rd.autotasks.meetstrangers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n == 0){
            System.out.println("Oh, it looks like there is no one here");
        }
        else if (n < 0){
            System.out.println("Seriously? Why so negative?");
        } else {

            Scanner fin = new Scanner(System.in);

            String[] mas = new String[n];
            for (int i = 0; i < n; i++) {
                mas[i] = fin.nextLine();
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Hello, " + mas[i]);
            }
        }

    }
}
