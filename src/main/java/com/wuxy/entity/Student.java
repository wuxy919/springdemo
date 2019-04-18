package com.wuxy.entity;

/**
 * @author: wuxy
 * @create: 2019-04-18 09:04
 **/
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Classes classes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", classes=" + classes +
                '}';
    }

    public Student() {
//        System.out.println("创建了student对象");
    }

    public Student(int id, String name, int age, String gender) {
        System.out.println("通过有参构造函数创建了student对象");
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student(int id, String name, int age, String gender, Classes classes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.classes = classes;
    }
}
