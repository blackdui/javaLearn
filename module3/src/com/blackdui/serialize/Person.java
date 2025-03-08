package com.blackdui.serialize;

import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 18L;
    private String name;
    private String id;

    public Person() {
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id;
    }
}
