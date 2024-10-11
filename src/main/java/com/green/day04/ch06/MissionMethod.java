package com.green.day04.ch06;

public class MissionMethod {
    static void printStar(int n){
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printStar(5); // *****
        printStar(2); // **
    }
}