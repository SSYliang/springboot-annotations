package com.example.springtest.entity;

public class PersonConditional {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public PersonConditional(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonConditional{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
