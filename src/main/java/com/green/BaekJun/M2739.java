package com.green.BaekJun;

import java.util.Scanner;

public class M2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1; i<10; i++){
            System.out.printf("%d * %d = %d\n", n , i, (n*i));
        }
    }
}
