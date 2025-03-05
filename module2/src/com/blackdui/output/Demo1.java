package com.blackdui.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("1.txt", true);
//        fos.write(100);
        String s = "\n marisa and reimu";
        byte[] bytes = s.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
