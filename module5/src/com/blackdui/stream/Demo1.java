package com.blackdui.stream;

import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "great", "fat", "make", "shingu");

        Stream<String> stream1 = Stream.of("marisa", "reimu", "onozuka", "nazrin");
        Stream<Integer> stream2 = Stream.of(1, 3, 4, 5);


        //System.out.println(stream);

        //long count = stream.count();
        //System.out.println(count);

        //stream.filter(s->s.endsWith("t")).forEach(s-> System.out.println(s));
        //stream.forEach(s-> System.out.println(s));


        //stream.limit(3).forEach(s-> System.out.println(s));

        //stream.skip(2).forEach(s-> System.out.println(s));

        //Stream<String> st2 = Stream.concat(stream, stream1);

        //st2.filter(s->s.endsWith("u")).forEach(s-> System.out.println(s));
        stream2.map(intger->intger+"").forEach(s-> System.out.println(s + 1));

    }
}
