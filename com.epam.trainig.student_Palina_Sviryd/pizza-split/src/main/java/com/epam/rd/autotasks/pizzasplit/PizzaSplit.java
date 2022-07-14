package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int p = in.nextInt();

        int pizza = 1;
        int sum = p;

        while (sum % n != 0){
            sum = sum + p;
            pizza++;
        }

        System.out.println(pizza);
    }
}
