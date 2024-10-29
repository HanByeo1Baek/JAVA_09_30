package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        //만약 BufferedWriter writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장은 실행이 되지 않는다.
        //그런데 writer.close(); 이 문장이 무조건 실행이 되어야 한다.
        try{
            Path path = Paths.get("D:/Simple.txt");// 절대경로(full 경로)
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class FinallyCase2{
    public static void main(String[] args) {
        Path path = Paths.get("D:/Simple.txt");// 절대경로(full 경로)
        BufferedWriter writer = null;
        try{
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
        }catch (IOException e){
            writer.close();

        }

    }
}