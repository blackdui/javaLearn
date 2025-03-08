package com.blackdui.lambda;

public class Demo1 {
    public static void main(String[] args) {
//        new Thread(() -> {
//                System.out.println("hello");
//            }
//        ).start();
        /**
         * hello
         * this is
         * a
         * documentaion
         * innotation
         */
        //new Thread(() -> System.out.println("hello world")).start();

        method(new USB() {
            @Override
            public void open() {
                System.out.println("open");
            }
        });

    }
    public static void method(USB usb){
        usb.open();
    }
}
