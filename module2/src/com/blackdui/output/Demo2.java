package com.blackdui.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
//        String s = "marsia";
//        byte[] bytes = s.getBytes();

        File file1 = new File("1.txt");
        FileOutputStream fos = new FileOutputStream(file1, true);
//        fos.write(bytes, 0, 3);
        fos.write("\nreimu".getBytes());
        fos.close();
    }
}
