package com.blackdui.properties;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        IOUtils.copy(new FileInputStream("1.txt"), new FileOutputStream("10.txt"));
    }
}
