package com.green.day02.ch04;

public class LogicalOp {
    public static void main(String[] args) {
        /*
            논리 연산자 : &&, ||, !
         */
        int n1 = 11, n2 = 22;
        boolean result;

        result = (1 < n1) && (n1 < 100); // true, 2~99인지
        System.out.printf("%d은 1 초과 100 미안인가? %b\n", n1, result);
        
        result = ((n2 % 2 == 0) || (n2 % 3 == 0));// true, 2의 배수이거나 3의 배수인지
        System.out.printf("%d는 2 또는 3의 배수인가? %b\n", n2, result);

        result = !(n1 != 0);; // false
        System.out.printf("%d는 0인가? %b\n", n1, result);
        System.out.printf("%d는 0인가? %b\n", n1, n1 == 0);
    }
}
