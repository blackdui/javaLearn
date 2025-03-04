package com.blackdui.hashMap;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("marisa", 18);
        map.put("reimu", 19);
        map.put("nazrin", 17);

        Set<String> set = map.keySet();
        for (String s :
                set) {
            System.out.println(map.get(s));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> set1:
                entries) {
            String key = set1.getKey();
            Integer value = set1.getValue();
            System.out.println(key + " " + value);
        }

        //重写equals和hashcode
    }
}
