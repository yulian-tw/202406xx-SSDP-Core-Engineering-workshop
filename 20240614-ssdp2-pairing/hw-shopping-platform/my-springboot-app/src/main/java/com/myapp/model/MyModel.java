package com.myapp.model;

public class MyModel {
    // Add your model properties here
    private String name;
    private int age;

    // Add constructors, getters, and setters here

    public MyModel() {
    }

    public MyModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}