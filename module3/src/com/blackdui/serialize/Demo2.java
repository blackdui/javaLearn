package com.blackdui.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oread = new ObjectInputStream(new FileInputStream("4.txt"));

        Object o = oread.readObject();

        System.out.println(o);
    }
}
