package com.green.day05.ch06;

public class Mission06_2_1 {
    static double S(int n){
        return 3.14 * n * n;
    }
    static double L(int n){
        return 2 * 3.14 * n;
    }
    public static void main(String[] args) {
        /*
        인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산하여 반환하는 메소드와
        원의 둘레를 계산하여 반환하는 메소드를 각각 정의하고, 이 둘을 호출하는 main 메소드를 정의하자.
         */

        double result = S(10);
        double result2 = L(10);
        System.out.printf("원의 넓이는 : %.2f\n", result);
        System.out.printf("원의 둘레는 : %.2f\n", result2);

    }
}