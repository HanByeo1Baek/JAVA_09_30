package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /*
        1~10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성
         */
        int result = 1;
        for(int i = 2; i<11; i++){
            result *= i;
        }
        System.out.printf("%,d", result);
    }
}
