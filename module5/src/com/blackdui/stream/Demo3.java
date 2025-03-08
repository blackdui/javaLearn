package com.blackdui.stream;

import java.util.function.Function;
import java.util.function.Supplier;

public class Demo3 {
    public static void main(String[] args) {
        method(()->"hello".replace("h", "m"));
        Integer i = Integer.valueOf("3");
        method1(in-> in + "", i);
    }

    public static void method(Supplier<String> supplier){
        String s1 = supplier.get();
        System.out.println(s1);
    }

    public static void method1(Function<Integer, String> function, Integer i){
        String apply = function.apply(i);
        System.out.println(apply + 1);
    }
}
