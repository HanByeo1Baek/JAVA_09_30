package com.green.day15.ch18;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력 : ");
        try {
            int age = readAge();
            System.out.printf("입력된 나이 : %d\n", age);
        } catch (ReadAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-- 끝 --");
    }

    public static int readAge() throws  ReadAgeException{
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age < 0){
            s.close();
            throw new ReadAgeException();
        }
        System.out.println(">> if문 이후");
        s.close();
        return age;
    }
}

class ReadAgeException extends Exception{
    ReadAgeException(){
        super("유효하지 않은 나이가 입력되었습니다."); // 부모클래스의 생성자 호출한 것.
    }
}
