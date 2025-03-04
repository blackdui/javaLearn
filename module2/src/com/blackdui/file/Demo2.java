package com.blackdui.file;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        File file1 = new File("C:\\_01_0_Documents\\java");
        recurseFiles(file1);
    }

    public static void recurseFiles(File file){
        File[] files = file.listFiles();
        for (File f1 :
                files) {
            if (f1.isFile()) {
                String name = f1.getName();
                if (name.endsWith(".jpg")){
                    System.out.println(f1);
                }
            }else {
                recurseFiles(f1);
            }
        }
    }
}
