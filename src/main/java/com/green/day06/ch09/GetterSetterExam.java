package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student(); // s1 객체
        s1.setName("홍길동");
        s1.setAge(20);
        s1.setHeight(6);
        System.out.printf("name : %s\nage : %d\nheight : %.1f\n",
                        s1.getName(), s1.getAge(), s1.getHeight());

        Student s2 = new Student(); // s2 객체
        s2.setName("신사임당");
        s2.setAge(24);
        s2.setHeight(8);
        System.out.printf("name : %s\nage : %d\nheight : %.1f\n",
                        s2.getName(), s2.getAge(), s2.getHeight());

    }
}
class Student{
    private String name;
    private int age;
    private float height;

    // this는 상수이고 나 자신의 주소값이 저장된 공간 (나 자신을 가리킨다)

    //name-setter
    public void setName(String name){
        this.name = name;
    }
    //name-getter
    public String getName(){
        return name;
    }
    //age-setter
    public void setAge(int age){
        this.age = age;
    }
    //age-getter
    public int getAge(){
        return age;
    }
    //height-setter
    public void setHeight(float height){
        this.height = height;
    }
    //height-getter
    public float getHeight(){
        return height;
    }

}