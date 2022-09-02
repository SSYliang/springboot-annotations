package com.example.springtest.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "xiaomao")
public class MyConfigurationProperties {
    // 省略 get、set、toString 方法
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "MyConfigurationProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
}