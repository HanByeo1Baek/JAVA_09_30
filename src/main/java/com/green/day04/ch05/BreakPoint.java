package com.green.day04.ch05;

public class BreakPoint {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            for(int z=1; z<10; z++){
                if((i*z)==72){
                    System.out.printf("%d x %d = %d\n", i, z, (i*z));
                    break;
                }
            }
        }
        System.out.println("--끝--");
    }
}
