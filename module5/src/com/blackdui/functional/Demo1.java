package com.blackdui.functional;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + "";
            }
        }, 100);
    }

    public static void method(Function<Integer, String> function, Integer integer){
        String apply = function.apply(integer);

        System.out.println(apply + 1);
    }
}
