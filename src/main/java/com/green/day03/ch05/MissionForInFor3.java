package com.green.day03.ch05;

public class MissionForInFor3 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6)+3; // 3 ~ 8 사이의 랜덤 숫자
        System.out.println(star);

        // star=3
        // ***
        // ***
        // ***

        // star=4
        // ****
        // ****
        // ****
        for(int i=0; i<star; i++){
            for(int k=0; k<star; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------");

        for(int j=1; j<=(star*star); j++){
            System.out.print("*");
            if(j % star == 0){
                System.out.println();
            }
        }
    }
}
