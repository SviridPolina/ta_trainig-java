package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hh = 0;
        hh = seconds / 3600;
        seconds = seconds % 3600;

        int mm = 0;
        mm = seconds / 60;
        seconds = seconds % 60;

        if (hh % 24 == 0){
            System.out.print("0:");
        }
        else {
            System.out.print(hh + ":");
        }
        if (mm >= 10){
            System.out.print(mm + ":");
        }
        else {
            System.out.print("0" + mm + ":");
        }
        if (seconds >= 10){
            System.out.print(seconds);
        }
        else {
            System.out.print("0" + seconds);
        }
    }
}
