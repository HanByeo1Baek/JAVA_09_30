package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_2 {
    /*
        다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자.
        1   2   3   >>1행
        4   5   6   >>2행
        7   8   9   >>3행

        이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면,
        다음의 형태로 배열의 구조를 변경시키는 메소드를 정의하자.

        7   8   9
        1   2   3
        4   5   6

        물론 배열의 가로와 세로 길이에 상관 없이 위와 같이 동작하는 메소드를 정의해야 한다.
     */
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
//        arrayChangeOrder1(arr);
        arrayChangeOrder(arr);
        System.out.println(Arrays.deepToString(arr));

    }
    public static void arrayChangeOrder(int[][] arr){
        int lastIdx = arr.length -1;
        int[] last = arr[lastIdx];
        for(int i= lastIdx; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }

//    public static void arrayChangeOrder1(int arr[][]){
//        int[][] arr2 = new int[arr.length][arr.length];
//        for(int i=0; i<arr.length; i++){
//            for(int k=0; k<arr[i].length; k++){
//                arr2[i][k] = arr[i][k];
//                if(i == 0){
//                    arr[i][k] = arr2[i+2][k];
//                }
//                else if(i == 1){
//                    arr[i][k] = arr2[i-1][k];
//                }
//                else if (i == 2){
//                    arr[i][k] = arr2[i-1][k];
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//    }
}
