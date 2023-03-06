package com.example.demo.domain;

public class User {
    private String name;
    private long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public User(String name, long age) {
        this.name = name;
        this.age = age;
    }
}
