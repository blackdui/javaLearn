package com.blackdui.input;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");

//        int data = fis.read();
//        fis.close();
//        System.out.println(data);
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }

    }
}
