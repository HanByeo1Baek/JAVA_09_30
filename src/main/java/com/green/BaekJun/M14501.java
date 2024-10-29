package com.green.BaekJun;

import java.util.Scanner;
public class M14501 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int day = s.nextInt();

        int[] d = new int[day];
        int[] m = new int[day];

        for(int i=0; i<day; i++){
            d[i] = s.nextInt();
            m[i] = s.nextInt();
        }

        int[] dp = new int[day+1];


        for(int i=0;i<day;i++) {
            if(i+d[i]<=day) {	//범위에 벗어나지 않는다면
                dp[i+d[i]]=Math.max(dp[i+d[i]],dp[i]+m[i]);
            }
            dp[i+1]=Math.max(dp[i+1],dp[i]);	//다음dp=현재 누적값vs 다음 누적값

        }
        System.out.println(dp[day]);

    }
}
