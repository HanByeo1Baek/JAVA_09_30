package com.green.BaekJun;

import java.util.Scanner;

public class M2751 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        int index = arr.length-1;
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
            int temp = arr[i];
            if(arr[index] > arr[i]){
                arr[i] = arr[index];
                arr[index] = temp;
            }
            index--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
