package com.Situ.Day4;

import com.Situ.Day5.Person;

public class Student extends Person {
//    private int id;
//    private String name;
//    private int age;
    private String className;
//快捷键alt+insert
//get方法
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }
    //无参select none

    public Student() {
    }
    //构造canstructor
    public Student(int id, String name, int age, String className) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.className = className;
    }
}
