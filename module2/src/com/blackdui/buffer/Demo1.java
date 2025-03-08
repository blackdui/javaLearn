package com.blackdui.buffer;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("3.txt");
        FileInputStream fis = new FileInputStream("1.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
