package com.blackdui.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo1 {
    @Test
    public void method(){
        System.out.println("hello");
    }
    @Test
    public void method3(){
        System.out.println("hello3");
    }
    @Before
    public void add(){
        System.out.println("before");
    }
    @After
    public void delete(){
        System.out.println("after");
    }
}
