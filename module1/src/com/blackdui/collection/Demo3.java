package com.blackdui.collection;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("marisa");
        list.add("tenshi");
        list.add("izayoi");

        for (String s:
             list) {
            System.out.println(s);
        }
    }
}
