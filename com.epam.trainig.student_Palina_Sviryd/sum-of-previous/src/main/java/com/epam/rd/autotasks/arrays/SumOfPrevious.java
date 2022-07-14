package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        //put your code here
        int n = array.length;
        boolean[] mas = new boolean[n];
        mas[0] = false;
        mas[1] = false;

        if (n == 2){
            return mas;
        }

        for (int i = 2; i < n; i ++){
            if (array[i] == array[i-1] + array[i-2]){
                mas[i] = true;
            }
            else{
                mas[i] = false;
            }
        }
        return mas;
    }
}
