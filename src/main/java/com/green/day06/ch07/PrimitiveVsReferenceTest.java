package com.green.day06.ch07;

public class PrimitiveVsReferenceTest {
    /*
    main메소드에 있는 num변수(main-num)와 changeNum 메소드에 있는 num매개변수(m-num)는 다른 공간이다.
    main-num이 가지고 있는 값을 복사하여 m-num에 저장했다.
    m-num값을 변경한다고 하여 main-num값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문
     */
    public static void changeNum(int num) {
        num = 100;
    }

    /*
    main메소드에 있는 nb변수(main-nb)와 changeNum메소드에 있는 nb매개변수(m-nb)는 다른 공간이다.
    다만 같은 값(주소 값)을 가지고 있다. 그로인해 같은 객체에 접근할 수 있다.
    m-nb를 통해 객체의 num값을 변경을 했다면 main-nb를 통해 접근했을 때 변경된 값을 얻게 된다.
    왜? 다른 공간이지만 같은 주소 값을 갖고 있기 때문
     */
    public static void changeNum(NumberBox nb) {
        nb = new NumberBox();
        nb.num = 100;
    }

    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println("num : " + num); // 10

        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum(nb);
        System.out.println("nb.num : " + nb.num); // 10
    }
}

class NumberBox {
    int num;
}
