package com.wuxy.test;

import com.wuxy.entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wuxy
 * @create: 2019-04-18 12:53
 **/
public class Test3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        Student2 student = (Student2) applicationContext.getBean("student");
        System.out.println(teacher);
        System.out.println(student);
        Teacher teacher2 = (Teacher) applicationContext.getBean("teacher2");
        Student2 student2 = (Student2) applicationContext.getBean("student2");
        System.out.println(teacher2);
        System.out.println(student2);
        Clazz clazz = (Clazz) applicationContext.getBean("clazz");
        System.out.println(clazz);
    }
}
