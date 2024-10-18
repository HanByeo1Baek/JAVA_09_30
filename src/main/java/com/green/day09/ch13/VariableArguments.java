package com.green.day09.ch13;

public class VariableArguments {
    //가변 인수 (가변 인자) : 같은 타입의 변수를  제한 없이 다 받을 수 있는 것.
    // 자동으로 배열로 변환되어 들어옴
    static void sum(int n1, int n2){
        System.out.println(n1 + n2);
    }
    static void sum(int n1, int n2, int n3){
        System.out.println(n1 + n2 + n3);
    }
    static void sumVar(int... values){ // 배열로 변환이 되어서 파라미터로 들어온다.
        int n = 0;
        for(int i=0; i< values.length; i++){
            n += values[i];
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        sum(10, 22); // 3
        // sum 메소드 호출 아규먼트 정수값 2개를 보내고 있다.
        // void 메소드(혼자 있음)
        // 클래스 메소드 vs 인스턴스 메소드 : 객체 생성 부분이 없기 때문에 클래스 메소드 (static)

        sum(1, 2, 3);

        sumVar(1);
        sumVar(1, 2);
        sumVar(1, 2, 3);
        sumVar(1, 2, 3, 4);


    }
}
