package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input

        int n = 1;
        int sum = scanner.nextInt();

        int k = scanner.nextInt();
        while (k != 0){
            n++;
            sum = sum + k;
            k = scanner.nextInt();
        }

        int avg = sum / n;
        System.out.println(avg);
    }

}