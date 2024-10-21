package com.green.BaekJun;

import java.util.Scanner;

public class BaekJun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input1 = s.nextInt();

        int arr[] = new int[input1];
        for(int i=0; i<input1; i++){
            arr[i] = s.nextInt();
        }

        int input3 = s.nextInt();

        int count = 0 ;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == input3){
                count++;
            }
        }
        System.out.println(count);

    }
}