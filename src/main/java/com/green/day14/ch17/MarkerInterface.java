package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
        //Report0~3 까지 객체화 해주세요.
        Report0 r0 = new Report0("Simple Funny News~");
        Report1 r1 = new Report1();
        Report2 r2 = new Report2();
        Report3 r3 = new Report3();

        //Printer 클래스 아래에 있는 printContents 메소드 호출하고 싶어요.
        //호출할 때 r0의 주소값을 보내주세요.

        Printer pr = new Printer();
        pr.printContents(r0);
        pr.printContents(r1);
        pr.printContents(r2);
        pr.printContents(r3);


    }
}

interface Printable2 {
    String getContents();

}

interface Upper{}
interface Lower{}

class Report0 extends Object implements Printable2{
    private String contents;

    Report0(String contents){
        this.contents = contents;
    }

    public String getContents(){
        return contents;
    }

}

class Report1 implements Printable2, Lower{
    @Override
    public String getContents(){
        return "Simple Funny News~";
    }
}
class Report2 implements Printable2, Upper{
    @Override
    public String getContents(){
        return "Simple Funny News~";
    }
}
class Report3 implements Printable2, Upper, Lower{
    @Override
    public String getContents(){
        return "Simple Funny News~";
    }
}


class Printer{
    public void printContents(Printable2 doc){
        if(doc instanceof Upper){
            System.out.println(doc.getContents().toUpperCase());
        }
        else if(doc instanceof Lower){
            //아래 2줄은
//            String str = doc.getContents();
//            System.out.println(str.toLowerCase());
            System.out.println(doc.getContents().toLowerCase());
        }
        else{
            System.out.println(doc.getContents());
        }
    }
}