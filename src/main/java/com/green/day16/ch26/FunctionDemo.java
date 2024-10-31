package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 100, 30, 40 , 200};
        //배열안에서 가장 큰 숫자 리턴
        Function<int[], Integer> fn = (arr2) -> {
            int temp = arr2[0];
            for(int i=1; i<arr2.length; i++){
                if(temp < arr2[i]){
                    temp = arr2[i];
                }
            }
            return temp;
        };

        int maxValue = fn.apply(arr);
        System.out.println("maxValue : " + maxValue);
    }
}
