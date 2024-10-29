package com.green.BaekJun;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class M1934 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[][] arr = new int[n1][2];
        for (int i = 0; i < n1; i++) {
            for (int i2 = 0; i2 < 2; i2++) {
                arr[i][i2] = s.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (arr[i][i2] == 1) {
                    System.out.println(i * i2);
                } else if ((arr[i][i2] / arr[i][i2]) == 1) {
                    System.out.println(i * i2);
                } else {
                    System.out.println("ㅁㄴㅇ");
                }
            }
        }
    }
}
