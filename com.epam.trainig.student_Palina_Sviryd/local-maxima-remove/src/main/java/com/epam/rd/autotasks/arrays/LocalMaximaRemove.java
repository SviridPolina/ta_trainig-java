package com.epam.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{-3, 2, 4, 3, 5, 12, 8};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        if (array.length == 2){
            int[] mas = new int[1];
            if (array[0] > array[1]){
                mas[0] = array[1];
                return mas;
            }
            else {
                mas[0] = array[0];
                return mas;
            }
        }

        //put your code here
        List<Integer> locals = new ArrayList<Integer>();
        if (array[0] <= array[1]) {
            locals.add(array[0]);
        }
        for (int i = 1; i < array.length-1; i++) {
            if (array[i] <= array[i + 1] || array[i] <= array[i - 1]) {
                locals.add(array[i]);
            }
        }
        if (array[array.length - 2] >= array[array.length - 1]) {
            locals.add(array[array.length - 1]);
        }

        int[] arr = new int[locals.size()];
        for (int i = 0; i < locals.size(); i++) {
            arr[i] = locals.get(i);
        }
        return arr;
    }
}
