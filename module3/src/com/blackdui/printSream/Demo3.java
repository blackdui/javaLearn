package com.blackdui.printSream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("hello.txt", true));

        System.setOut(ps);

        System.out.println("hello world ");
        System.out.println("marisa to reimu");

        ps.close();
    }
}
