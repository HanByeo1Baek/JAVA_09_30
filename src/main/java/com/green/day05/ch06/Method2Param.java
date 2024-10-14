package com.green.day05.ch06;
//Parameter
public class Method2Param {
    static void hiEveryone(int n1, double n2){
        System.out.printf("제 나이는 %d세 입니다.\n저의 키는 %.1fcm입니다.\n", n1, n2);
    }
    static void byEveryone(){
        System.out.println("다음에 뵙겠습니다.");
    }
    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12, 12.5);
        /*
        제 나이는 12세 입니다.
        저의 키는 12.5cm입니다.
         */
        hiEveryone(13, myHeight);
        /*
        제 나이는 13세 입니다.
        저의 키는 175.9cm입니다.
         */
        byEveryone();
        //다음에 뵙겠습니다.

    }
}