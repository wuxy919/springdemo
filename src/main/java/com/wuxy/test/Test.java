package com.wuxy.test;

import com.wuxy.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wuxy
 * @create: 2019-04-18 09:07
 **/
public class Test {
    public static void main(String[] args) {
//        // 传统的创建对象
//        Student student = new Student();
//        System.out.println(student);
//        // 加载spring.xml配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        // 获取IOC中的对象
//        Student student1 = (Student)applicationContext.getBean("student");
//        System.out.println(student1);

        MyClassPathXmlApplicationContext myClassPathXmlApplicationContext = new MyClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)myClassPathXmlApplicationContext.getBean("student");
        System.out.println(student);


    }
}
