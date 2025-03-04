package com.blackdui.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("marisa");
        set.add("reimu");
        set.add("nazrin");

        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }


    }
}
