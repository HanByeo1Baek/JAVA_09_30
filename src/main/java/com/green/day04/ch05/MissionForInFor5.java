package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6)+3;
        System.out.println("star : " + star);
        /*
             star = 3
             __*
             _**
             ***
         */

        for(int i=0; i<star; i++){
            for(int k=i; k<star-1; k++){
                System.out.print("_");
            }
            for(int z=0; z<=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        for(int i=1; i<=star; i++){
            for(int k=star; k>0; k--){
                if(i >= k){
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
