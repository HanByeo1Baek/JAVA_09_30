package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        sub1.showCount(); // 3

    }
}
// 하나의 자바 파일에는 하나의 public class 만 가질 수 있다.
class SuperCLS{
    protected static int count;
    SuperCLS(){
        count++;
    }
}
class SubCLS extends SuperCLS{
    void showCount(){
        System.out.println("count : " + count);
    }
}