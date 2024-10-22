package com.green.BaekJun;

import java.util.Scanner;

public class M2566 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        for(int i=0; i<arr.length; i++){
            for(int k=0; k<arr[i].length; k++){
                arr[i][k] = s.nextInt();
            }
            for(int z=0; z<arr[i].length; z++){
                if(max < arr[i][z]){
                    max = arr[i][z];
                    x = i;
                    y = z;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", x+1, y+1);
    }
}
