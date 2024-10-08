package com.green.day02.ch05;
import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        // 남성은 172cm, 여성은 159cm 평균
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (w/m)");
        String gender = scan.next();
        System.out.print("키를 정수값으로 입력해 주세요.(cm)");
        int height = scan.nextInt();

        System.out.printf("성별 : %s, 키 : %d\n", gender, height);
        // 당신은 평균입니다.
        // 당신은 평균보다 큽니다.
        // 당신은 평균보다 작습니다.

        // 만약 성별 : "남", 키 : 162 >> 당신은 평균보다 작습니다.
        // 만약 성별 : "여", 키 : 160 >> 당신은 평균보다 큽니다.
//        ↓ 강사님이 하신거
//        int standHeight = 159;
//        switch(gender){
//            case "m":
//                standHeight = 172;
//        }
//        if(standHeight < height){
//            System.out.println("당신은 평균보다 큽니다.");
//        }
//        else if(standHeight > height){
//            System.out.println("당신은 평균보다 작습니다.");
//        }
//        else {
//            System.out.println("당신은 평균입니다.");
//        }

        // ↓ 내가 한거
        switch(gender){
            case"m":
                if(height > 172){
                    System.out.println("당신은 평균보다 큽니다."); break;}
                else if(height == 172){
                    System.out.println("당신은 평균입니다."); break;}
                else{
                    System.out.println("당신은 평균보다 작습니다."); break;}
            case "w":
                if(height > 159){
                    System.out.println("당신은 평균보다 큽니다."); break;}
                else if(height == 159){
                    System.out.println("당신은 평균입니다."); break;}
                else{
                    System.out.println("당신은 평균보다 작습니다."); break;}
        }
    }
}
