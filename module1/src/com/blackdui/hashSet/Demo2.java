package com.blackdui.hashSet;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("marisa", 8);
        map.put("reimu", 18);
        map.put("nazrin", 17);
        map.put("knowledge", 19);
        System.out.println(map);

        int value = map.put("marisa", 17);
        System.out.println(value);

        int value2 = map.get("marisa");
        System.out.println(value2);

//        int value1 = map.remove("marisa");
//        System.out.println(value1);


    }
}
