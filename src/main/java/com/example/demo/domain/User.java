package com.example.demo.domain;

public class User {

    //필드
    private long id;
    private String name;
    private long age;

    //Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
