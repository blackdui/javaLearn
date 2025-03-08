package com.blackdui.printSream;

import java.io.IOException;
import java.io.PrintStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        PrintStream printStream = new PrintStream("printsream.txt");
        printStream.println("hello world");
        printStream.print("marisa");
        printStream.close();



    }
}
