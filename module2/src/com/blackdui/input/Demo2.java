package com.blackdui.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\01_0_Documents\\java\\sakura.jpg");
        //文件读取
        FileOutputStream fos = new FileOutputStream("C:\\01_0_Documents\\java\\newsakura.jpg");

        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes, 0, len);//从数组零索引开始写入
        }
        fis.close();
        fos.close();

    }
}
