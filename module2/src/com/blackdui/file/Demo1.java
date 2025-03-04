package com.blackdui.file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\_01_0_Documents\\java\\new");
        File file2 = new File("C:\\_01_0_Documents\\java\\new.txt");

        //file1.createNewFile();

        file1.mkdirs();

//        System.out.println("file1.delete() = " + file2.delete());
        System.out.println("file1.isFile() = " + file1.isFile());
        System.out.println("file1.isDirectory() = " + file1.isDirectory());
        System.out.println("file1.exists() = " + file1.exists());
    }
}
