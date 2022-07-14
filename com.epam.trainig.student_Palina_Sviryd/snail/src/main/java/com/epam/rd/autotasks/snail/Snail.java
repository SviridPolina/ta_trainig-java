package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();

        int i = a - b;
        int n = 0;

        if (a >= h){
            System.out.print("1");

        } else if (i <= 0){
            System.out.print("Impossible");

        } else {

            int k = 0;
            while (k < h) {
                k = k + a;
                if (k >= h) {
                    n++;
                    break;
                }
                k = k - b;
                n++;
            }

            System.out.print(n);
        }
    }
}
