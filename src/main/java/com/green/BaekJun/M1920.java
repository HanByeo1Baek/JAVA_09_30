package com.green.BaekJun;

import java.util.Scanner;

public class M1920 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];

        for(int i=0; i<n2; i++){
            arr2[i] = s.nextInt();
        }

        for(int i=0; i<n; i++){
            int count = 0;
            for(int k=0; k<n2; k++){
                if(arr2[i] == arr[k]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
