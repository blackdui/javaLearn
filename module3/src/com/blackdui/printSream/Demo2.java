package com.blackdui.printSream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("hello.txt");

        System.setOut(ps);

        System.out.println("marisa");
        System.out.println("reimu");
        System.out.println("java");
        ps.close();
    }
}
