package com.blackdui.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("marisa", "1234");

        properties.load(new FileInputStream("1.txt"));

        System.out.println(properties);


    }
}
