package com.green.day03.ch05;

public class MissionContinueResult {
    public static void main(String[] args) {
        /*
        자연수 1부터 시작해서 모든 홀수를 더해 나간다.
        그리고 그 합이 언제 1000을 넘어서는지,
        그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자
         */

        int i = 1;
        int odd = 0;

        while(true){
            System.out.println("i : "+ i);
            odd += i;
            if(odd >= 1000){
                break;
            }
            i += 2;
        }
        System.out.println("마지막 더한 값 : " + i);
        System.out.println("odd : " + odd);
    }
}
