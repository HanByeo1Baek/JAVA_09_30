package com.green.BaekJun;

import java.util.Scanner;

public class M2444 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=0; i<a; i++){
            for(int k=a-1; k>i; k--){
                System.out.print(" ");
            }
            for(int i2=0; i2<=i; i2++){
                System.out.print("*");
            }
            for(int z=0; z<i; z++){
                System.out.print("*");
            }
            if(i<a){
                System.out.println();
            }

        }
        for(int i=0; i<a-1; i++){
            for(int i2=0; i2<=i; i2++){
                System.out.print(" ");
            }
            for(int i3=a-1; i3>i; i3--){
                System.out.print("*");
            }
            for(int i4=3; i4>i; i4--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
