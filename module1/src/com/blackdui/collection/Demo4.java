package com.blackdui.collection;

public class Demo4 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        System.out.println(list);
        Object element = list.get(0);
        System.out.println(element);
    }
}
