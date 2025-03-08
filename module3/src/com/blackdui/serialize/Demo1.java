package com.blackdui.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream owrite = new ObjectOutputStream(new FileOutputStream("4.txt"));

        Person marisa = new Person("marisa", "007");
        owrite.writeObject(marisa);

    }
}
