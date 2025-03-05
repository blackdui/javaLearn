package com.blackdui.fileReader;

import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        //解决编码问题

        char[] chars = new char[2];

        int len;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }
}
