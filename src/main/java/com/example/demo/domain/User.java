package com.example.demo.domain;

/**
 * @Author: georgexie
 * @description: TODO
 * @Date: 2019/7/18 0018 11:19
 * @Version 1.0
 */
public class User {
    private Long id;
    private String name;
    private Integer age;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
