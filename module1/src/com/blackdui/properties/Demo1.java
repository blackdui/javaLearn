package com.blackdui.properties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<HashMap<Integer, String>> maps = new ArrayList<>();
        HashMap<Integer, String> class1 = new HashMap<>();
        HashMap<Integer, String> class2 = new HashMap<>();

        class1.put(1, "张三");
        class1.put(2, "李四");
        class1.put(3, "王五");


        class2.put(4, "黄晓明");
        class2.put(5, "样颖");
        class2.put(6, "黄晓明");

        maps.add(class1);
        maps.add(class2);

        System.out.println(maps);

    }
}
