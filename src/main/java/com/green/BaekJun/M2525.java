package com.green.BaekJun;

import java.util.Scanner;

public class M2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int m = s.nextInt();
        int nm = s.nextInt();


        int min = 60 * t + m;
        min += nm;

        int h = (min/60) %24;
        int minute = min % 60;

        System.out.println(h + " " + minute);
    }
}
