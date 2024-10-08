package com.green.day02.ch05;

public class MissionIf4Result {
    public static void main(String[] args) {
        int score = (int)(Math.random()*101.0); // 0~100사이의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score : %d\n", score);

        String grade = "D", opt = "";
        int gradeScore = score/10;
        switch(gradeScore) {
            case 9, 10: grade = "A"; break;
            case 8: grade = "B"; break;
            case 7: grade = "C"; break;
        }
        int optScore = score % 10;
        if(gradeScore > 6){
            if((optScore >= 8) || (score == 100)){opt = "+";}
            else if(optScore >=4){opt = "0";}
            else{opt = "-";}
        }

        System.out.printf("%s%s\n", grade, opt);

//         ↓ 다른 책의 풀이법
//        char grade = 'D', opt = '0';
//
//        if(score >= 90){
//            grade = 'A';
//            if(score >= 98){ opt = '+';}
//            else if(score < 94){opt = '-';}
//        }
//        else if(score >= 80){
//            grade = 'B';
//            if(score >= 88){opt = '+';}
//            else if(score < 84){opt = '-';}
//        }
//        else if(score >= 70){
//            grade = 'C';
//            if(score >= 78){opt = '+';}
//            else if(score < 74){opt = '-';}
//        }
//        else{
//            grade = ' ';
//        }
//        System.out.printf("%c%c\n", grade, opt);
    }
}
