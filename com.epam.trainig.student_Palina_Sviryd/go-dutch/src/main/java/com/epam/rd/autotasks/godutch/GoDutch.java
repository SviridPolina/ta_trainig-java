package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner in = new Scanner(System.in);

        int sum = in.nextInt();
        if (sum < 0){
            System.out.print("Bill total amount cannot be negative");
        } else {

            int n = in.nextInt();
            if (n <= 0) {
                System.out.print("Number of friends cannot be negative or zero");

            } else {

                int res = 0;
                if (sum < n && sum != 0) {
                    res = 1;
                } else {
                    res = sum / n;
                    res = res + res / 10;
                }

                System.out.print(res);
            }
        }
    }
}
