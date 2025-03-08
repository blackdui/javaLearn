package com.blackdui.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("1.txt"));

        String s = br.readLine();
        System.out.println(s);
    }
}
