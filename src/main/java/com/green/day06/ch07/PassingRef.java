package com.green.day06.ch07;

public class PassingRef {
    static void check(BankAccount ba){
        ba.checkMyBalance(); // balance : 1000
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba;
        ba2.checkMyBalance();
        ba.checkMyBalance();

        // ↓ 주소 할당해준걸 풀어버리는 방법
        ba2 = null; // null의 의미는 아무런 객체를 가르키고 있지 않다. (주소값 없다.)
        if(ba2 != null){ // null 체크
            ba2.checkMyBalance();
        }
        // null인 상태에서 메소드 호출을 하면 NullPointException이 발생된다.
        // null인 상태에서 메소드 호출을 하면 안된다.
        
        //ba2 = new BankAccount(); // 다시 주소값을 가질 수 있다. 왜? 변수기 때문에

        check(ba);

        // 만약 아래처럼 적었다면 check메소드는 non-static메소드
        //PassingRef pf = new PassingRef();
        //pf.check(ba);
    }
    // 1. void, return
    // 2. static, non-static
}
