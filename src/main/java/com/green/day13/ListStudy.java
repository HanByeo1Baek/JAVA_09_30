package com.green.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStudy {
    /*
    List 인터페이스, Interface(인터페이스)는 객체화가 불가능하다.

    인터페이스는 부모역할만 한다. List를 상속받은
    class(LinkedList, ArrayList)가 있다.
    둘 class는 결과는 똑같은데 처리방식이 다르다.
    LinkedList는 Node방식으로 데이터를 다루고
    ArrayList는 Array(배열)방식으로 데이터를 다룬다.
    LinkedList는 수정 위주의 작업이 많으면 유리하고
    ArrayList는 읽기 위주의 작업이 많으면 유리하다.

    List 변수명 = new ArrayList();
    List 변수명 = new LinkedList();
    이렇게 작성이 가능하다.
     */
    public static void main(String[] args) {
        List list = new ArrayList(); //기존에는 칸이 없음
        list.add(10); // 0번방에 10값이 주입 값을 넣어주면서 칸이 새로 생김
        list.add(20); // 1번방에 20값이 주입 같은 값을 넣어도 칸이 새로 생김

        ArrayList list2 = (ArrayList)list; // shallow copy라서 출력하면 같은 결과가 나온다.
        list2.add(30); // 2번방에 30값이 주입
        list2.add("하하"); // 3번방에 하하 값이 주입

        int[] arr = new int[3];
        //arr[0] = "하하";
        Object[] arr2 = new Object[4]; // 무조건 모든 값을 받을 수 있는게 좋은건 아니다.
                                       // 정해진 타입으로 값을 받을 때가 좋을 때도 있다.
        arr2[0] = 10;
        arr2[1] = "하하";

        int val0 = (int)list.get(0);
        System.out.println("val0 : " + val0);

        String val3 = (String)list.get(3); // 3번 방에 있는 값 읽기
        System.out.println("val3 : " + val3);

        System.out.println(list);
        System.out.println(list2);
    }
}
