package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        //1~20 순차적으로 값을 넣어주세요.
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        //0~19 랜덤값
        int n = 0;
        int temp = 0;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            int rIdx = (int)(Math.random()*arr.length)+1;
            temp = arr[i];
            arr[i] = rIdx;
            for(int k=0; k<i; k++){
                n = arr[k];

                if(temp == (k+1)){
                    i--;
                }
                if(n == rIdx){
                    i--;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
