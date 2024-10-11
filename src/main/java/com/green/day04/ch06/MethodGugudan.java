package com.green.day04.ch06;
// 메소드는 재활용성을 극대화시켜야한다.
public class MethodGugudan {
    static void gugudan(int n){
        for(int i=1; i<10; i++){
            System.out.printf("%d x %d = %d\n", n, i, (i*n));
        }
        System.out.println("----------");
    }
    static void gugudanFromTo(int n1, int n2){
        for(int i=n1; i<=n2; i++){
//            for(int k=1; k<10; k++) {
//                System.out.printf("%d x %d = %d\n", i, k, (i * k));
//            }
            gugudan(i);
        }
    }
    public static void main(String[] args) {
        gugudan(4);
        gugudan(6);
        gugudanFromTo(5, 9);
        gugudanFromTo(2, 4);
    }
}
