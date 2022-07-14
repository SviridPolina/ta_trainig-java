package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int m, int n) {

        int k = 0, l = 0;
        int val = 1;

        int[][] vec = new int[m][n];

        while(k < n && l < m){

            for(int i = l; i < n; i++){
                if (vec[k][i] == 0) {
                    vec[k][i] = val++;
                }
            }
            k++;

            for (int i = k; i < m; i++){
                if(vec[i][n - 1] == 0) {
                    vec[i][n - 1] = val++;
                }
            }
            n--;

            for (int i = n-1 ; i >= l; i--){
                if (vec[m - 1][i] == 0) {
                    vec[m - 1][i] = val++;
                }
            }
            m--;

            for (int i = m - 1; i >= k; i--){
                if (vec[i][l] == 0) {
                    vec[i][l] = val++;
                }
            }
            l++;
        }
        return vec;
    }
}
