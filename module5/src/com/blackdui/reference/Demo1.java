package com.blackdui.reference;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        method(s->s.length(), "hello marisa");
    }

    public static void method(Function<String, Integer> function, String s){
        Integer i = function.apply(s);
        System.out.println(i);
    }
}
