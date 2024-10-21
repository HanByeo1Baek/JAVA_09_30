package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    /*
        다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.

        public static void addOneDArr(int [] arr, int add){

        }
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); // [1,2,3,4,5]
        addOneDArr (arr, 3);
        System.out.println(Arrays.toString(arr)); // [4,5,6,7,8]
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(arr2));
        addTwoDArr (arr2, 2);
    }
    public static void addOneDArr(int[] arr, int add){
        for(int i=0; i<arr.length; i++){
            arr[i] += add;
        }
    }
    // int [] 객체의 각 방의 타입 : int
    // int [][] 객체의 각 방의 타입 : int[]
    public static void addTwoDArr(int[][] arr2, int add){
        for(int[] item : arr2){
            addOneDArr(item, add);
            System.out.println(Arrays.toString(item));
        }
    }
}
