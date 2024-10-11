package com.green.day04.ch06;

public class MethodArithOp {
    static void sub(int n1, int n2){
        System.out.printf("%d - %d = %d\n", n1, n2, (n1-n2));
    }
    static void add(int n1, int n2){
        System.out.printf("%d + %d = %d\n", n1, n2, (n1+n2));
    }
    static void mul(int n1, int n2){
        System.out.printf("%d x %d = %d\n", n1, n2, (n1*n2));
    }
    static float div(int n1, int n2) {
        return (float)n1/n2;
    }
    static int mod(int n1, int n2){
        return n1 % n2;
    }
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        sub(n1, n2);
        sub(10, 2);
        sub(100, 200);
        //System.out.printf("%d - %d = %d\n", n1, n2, (n1-n2));
        mul(4, 5);
        //System.out.printf("%d x %d = %d\n", n1, n2, (n1*n2));
        add(7, 3);
        float r = div(10, 3);
        System.out.println("r: " + r);
        int r2 = mod(10, 4);
        System.out.println("r2: " + r2);
        mod(7, 3);
    }
}
