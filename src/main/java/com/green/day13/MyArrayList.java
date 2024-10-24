package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList(){
        clear();
//        arr = new int[5];
//        arr[0] = 2;
//        arr[1] = 3;
//        arr[2] = 4;
//        arr[3] = 5;
//        arr[4] = 6;
    }

    public void add(int n){
        int[] tmp = new int[arr.length+1];
        tmp[arr.length] = n;
        for(int i=0; i<arr.length; i++){
            tmp[i] = arr[i];
        }
        arr = tmp;
    }

    public int size(){
        return arr.length;
    }

    public void clear(){
        int[] tmp = new int[0];
        arr = tmp;
    }

    public int remove(){
        int[] tmp = new int[arr.length-1];
        int[] tmp2 = arr;
        for(int i=0; i<tmp.length; i++){
            tmp[i] = arr[i];
        }
        arr = tmp;
        return tmp2[arr.length];
    }

    @Override
    public String toString(){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d",arr[i]);
            if(i != arr.length-1){
                System.out.print(", ");
            }
        }
        return "]";
        //return String.format("[%d, %d, %d]", arr[0], arr[1], arr[2]);
    }
}
