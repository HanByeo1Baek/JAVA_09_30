package com.green.day10.ch13;

public class MissionTwoArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학
                {100, 90, 80}, //영수
                {90, 90, 80},  //상철
                {80, 70, 60}   //광수
        };
        /*
        영수 : 합계점수, 평균점수
        상철 : 합계점수, 평균점수
        광수 : 합계점수, 평균점수
        국어 : 합계점수, 평균점수
        영어 : 합계점수, 평균점수
        수학 : 합계점수, 평균점수
        학급 : 합계점수, 평균점수
         */
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(int i=0; i<score.length; i++){
            for(int i2=0; i2<score.length; i2++){
                if(i == 0){
                    sum += score[0][i2];
                }
                else if(i == 1){
                    sum2 += score[1][i2];
                }
                else if(i == 2){
                    sum3 += score[2][i2];
                }
            }
        }

        System.out.printf("영수의 합계점수 : %d, 평균 점수 : %d\n", sum, sum/3);
        System.out.printf("상철의 합계점수 : %d, 평균 점수 : %d\n", sum2, sum2/3);
        System.out.printf("광수의 합계점수 : %d, 평균 점수 : %d\n", sum3, sum3/3);

        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;

        for (int i=0; i<score.length; i++){
            for(int i2=0; i2<score[i].length; i2++){
                if(i2 == 0){
                    sum4 += score[i][0];
                }
                else if(i2 == 1){
                    sum5 += score[i][1];
                }
                else if(i2 == 2){
                    sum6 += score[i][2];
                }
            }
            sum7 = sum4+sum5+sum6;
        }
        System.out.printf("국어의 합계점수 : %d, 평균점수 : %d\n", sum4, sum4/3);
        System.out.printf("영어의 합계점수 : %d, 평균점수 : %d\n", sum5, sum5/3);
        System.out.printf("수학의 합계점수 : %d, 평균점수 : %d\n", sum6, sum6/3);
        System.out.printf("학급의 합계점수 : %d, 평균점수 : %d\n", sum7, sum7/9);

        System.out.println("------------------------");

        String[] names = {"영수", "상철", "광수"};
        int[] namesScore = new int[names.length];

        String[] subjects = {"국어", "영어", "수학"};
        int[] subjectsScore = new int[subjects.length];

        //각 이름별, 과목별 합계값 구하는 부분
        for(int i=0; i<score.length; i++){
            for(int i2=0; i2<score[i].length; i2++){
                namesScore[i] += score[i][i2]; // 학생별 합계 점수 정리
                subjectsScore[i2] += score[i][i2]; // 과목별 합계 점수 정리
            }
        }

        int totalScore = 0;
        for(int i=0; i<names.length; i++){
            totalScore += namesScore[i];
            System.out.printf("%s의 합계점수 : %d, 평균점수 : %d\n", names[i], namesScore[i], (namesScore[i] / subjects.length));
        }

        for(int i=0; i<subjectsScore.length; i++){
            System.out.printf("%s의 합계점수 : %d, 평균점수 : %d\n", subjects[i], subjectsScore[i], (subjectsScore[i] / names.length));
        }

        System.out.printf("학급의 합계점수 : %d, 평균점수 : %d\n", totalScore, totalScore / (names.length * subjects.length));
    }
}
