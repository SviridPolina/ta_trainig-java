package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (res < values[i]) {
                res = values[i];
            }
        }

        return res;
    }
}
