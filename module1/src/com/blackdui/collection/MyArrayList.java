package com.blackdui.collection;

import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] obj = new Object[10];
    private int size;

    public <E> boolean add(E e) {
        obj[size] = e;
        size++;
        return true;

    }

    public <E> E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
