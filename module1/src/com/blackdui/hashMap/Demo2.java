package com.blackdui.hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("输入字符串：");

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                Integer i1 = map.get(c) + 1;
                map.put(c, i1);
            }else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
