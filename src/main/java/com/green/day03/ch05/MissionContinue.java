package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*
        ContinueBasic의 존재하는 while문을 for문으로 변경해보자.
         */
        int count = 0;

        for(int i =1;i<100;i++){
            if((i % 5)!=0 || (i % 7)!=0){
                continue;
            }
            count++;
            System.out.println("i: " + i);
        }
        System.out.println("count : " + count);
    }
}
