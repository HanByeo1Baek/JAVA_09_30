package com.green;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        int count = 0;
        while (count < 20) {
            int randomNumber = rand.nextInt(20) + 1;  // 1~20 사이의 랜덤 숫자 생성
            if (!isDuplicate(arr, randomNumber, count)) {
                arr[count] = randomNumber;
                count++;
            }
        }

        // 결과 출력
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // 중복 확인 함수
    public static boolean isDuplicate(int[] arr, int num, int count) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == num) {
                return true;  // 중복이면 true 반환
            }
        }
        return false;  // 중복이 없으면 false 반환
    }
}
