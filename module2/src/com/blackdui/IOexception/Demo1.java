package com.blackdui.IOexception;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        //IO异常应该try catch
        try(FileWriter fw = new FileWriter("1.txt");){
            fw.write("hello world!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
