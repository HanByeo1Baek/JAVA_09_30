package com.green.BaekJun;

import java.util.Scanner;

public class M13458 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testroom = s.nextInt();
        int[] person = new int[testroom];

        for(int i=0; i< testroom; i++){
            person[i] = s.nextInt();
        }
        int v1 = s.nextInt();
        int v2 = s.nextInt();

        long count = 0;

        for(int i=0; i<testroom; i++){
            count++;
            person[i] -= v1;
            while(true){
                if((person[i]) > 0){
                    person[i] -= v2;
                    count++;
                }
                else if(person[i] < 1){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}