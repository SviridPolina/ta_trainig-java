package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner scanner = new Scanner(System.in);

        int res = scanner.nextInt();
        if (res == 0){
            return 0;
        }
        int n = scanner.nextInt();
        while (n != 0){
            if (n > res){
                res = n;
            }
            n = scanner.nextInt();
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
