package com.blackdui.transfer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("1.txt"), "utf-8");


    }
}
