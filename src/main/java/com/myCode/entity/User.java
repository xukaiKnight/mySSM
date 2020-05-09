package com.myCode.entity;

import org.springframework.stereotype.Component;

//@Component
public class User {
    private String name;
    private int age;

    public User(){
        System.out.println("无参构造被调用");
    }

    public User(String name,int age){
        System.out.println("有参构造被调用");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName方法被调用");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge方法被调用");
        this.age = age;
    }
}
