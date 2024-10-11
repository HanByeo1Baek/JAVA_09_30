package com.green.day04.ch05;

public class MissionForInFor4 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6)+3;
        /*
            star = 4
            *
            **
            ***
            ****
         */
        System.out.println("star : " + star);
        for(int i=0; i<star; i++){
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
