package com.green.day16.ch26;
//p.653
//익명 클래스
/*
    익명 클래스는 interface를 implements한 클래스를 만들지 않고
    다이렉트로 interface를 implements한 클래스를 객체화 할 때 사용할 수 있다.
    즉, 코드 작성을 많이 생략할 수 있다.
    익명 클래스 작성보다 더 많이 생략할 수 있는게 람다식이다.
    람다식을 작성할 수 있는 interface는 오로지 추상메소드 하나만 가지고 있는 경우만 가능하다.
    그래서 보통 람다식을 사용하는 interface는 @FunctionalInterface 애노테이션이 붙어있다.
    이 애노테이션은 2개의 추상메소드가 있으면 컴파일에러를 터트린다.
 */
public class UseAnonymousInner {
    public static void main(String[] args) {
         Printable p = new Printable() { //Printable 인터페이스를 implements 한 이름이 없는 클래스를 객체화한것
             @Override
             public void print() {
                 System.out.println("익명클래스 print");
             }
         };
         /*
         () 파라미터 부분
         -> 람다식 시작 부분
         {} : 중괄호 생략 가능한 경우는 명령이 한줄인 경우 생략 가능하다.
          */
         Printable p2 = () -> { //익명클래스보다 더 줄인 것이 람다 (성능은 똑같음, 적게 적으려고 쓰는 것)
             System.out.println("람다 print");
         };

         //Printable p2 = () -> System.out.println("asd"); >> 이것도 가능

         p.print();
         p2.print();
    }
}

//인터페이스는 객체화 불가능
//인터페이스는 추상메소드만 가질 수 있기 때문에 객체화를 하더라도 할 수 있는 역할이 없다 -> 그래서 객체화를 막아뒀다.
//추상메소드 하나만 가지고 있는 interface만 람다식을 사용할 수 있다.
@FunctionalInterface //추상메소드 하나만 가질 수 있게 한다.
interface Printable {
    void print();
    //void print2();
}