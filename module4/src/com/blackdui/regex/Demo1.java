package com.blackdui.regex;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "13391";
        System.out.println(method(s1));
        String s2 = "dah";
        System.out.println(method1(s2));
    }

    public static boolean method(String s){
        if (s.matches("[1-9][0-9]{4,14}")){
            return true;
        }
        return false;
    }

    public static boolean method1(String s){
        if (s.matches("[d][aeiou][h]")){
            return true;
        }
        return false;
    }
}
