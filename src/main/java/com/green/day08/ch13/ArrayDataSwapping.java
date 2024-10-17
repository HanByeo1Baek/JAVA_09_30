package com.green.day08.ch13;

import java.util.Arrays;

public class ArrayDataSwapping {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int arr2[] = new int[1];

        arr2[0] = arr[0];
        arr[0] = arr[2];
        arr[2] = arr2[0];

        System.out.println(Arrays.toString(arr));
        //arr[0]방의 값과 arr[2]의 값을 swapping해주세요.
    }
}
