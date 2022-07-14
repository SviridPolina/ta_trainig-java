package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int n = array.length;

        if (n != 1 && n != 0){
            int temp = array[n-1];

            for (int i = n - 1; i > 0; i--){
                array[i] = array[i-1];
            }
            array[0] = temp;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int n = array.length;
        if (n != 1 && n != 0){
            int[] mas = new int[array.length];
            for (int i = 0; i < array.length; i++){
                mas[i] = array[i];
            }

            for (int i = 0; i < array.length; i++){
                array[(i + shift) % n] = mas[i];
            }
        }
    }
}
