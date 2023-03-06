package com.example.demo.domain;

public class User {
    //필드
    private String name;
    private long age;

    //Getters & Setters
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

    //생성자
    public User(String name, long age) {
        this.name = name;
        this.age = age;
    }
}
