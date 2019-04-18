package com.wuxy.entity;

/**
 * @author: wuxy
 * @create: 2019-04-18 09:04
 **/
public class Student2 {
    private int id;
    private String name;

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

    public Student2() {
        System.out.println("创建了student对象");
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
