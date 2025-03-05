package com.blackdui.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("1.txt", true);

        fw.write("marisa");
        fw.flush();
        fw.close();
    }
}
