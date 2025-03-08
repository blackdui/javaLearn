package com.blackdui.trait;

public class Demo2 {
    public static void main(String[] args) {
        int n = 8;
        switch (n){
            case 3,4,5-> System.out.println("春");
            case 6,7,8-> System.out.println("夏");
            case 9,10,11-> System.out.println("秋");
            case 12,1,2-> System.out.println("冬");
            default -> System.out.println("nothing");
        }
        //yield返回值
    }
}
