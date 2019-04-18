package com.wuxy.test;

import com.wuxy.entity.Classes;
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
        // 1.加载spring.xml配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 2.获取IOC中的对象
//        Student student1 = (Student)applicationContext.getBean("student");
//        System.out.println(student1);
//        Student student2 = (Student)applicationContext.getBean("student2");
//        System.out.println(student2);
//        Student student3 = (Student)applicationContext.getBean("student3");
//        System.out.println(student3);
//        Student student4 = (Student)applicationContext.getBean("student4");
//        System.out.println(student4);
//        Student student5 = (Student)applicationContext.getBean("stu");
//        System.out.println(student5);

        // 2.通过运行时类获取对象
//        Student student = (Student)applicationContext.getBean(Student.class);
//        System.out.println(student);
//        System.out.println(student1 == student);


//        MyClassPathXmlApplicationContext myClassPathXmlApplicationContext = new MyClassPathXmlApplicationContext("spring.xml");
//        Student student = (Student)myClassPathXmlApplicationContext.getBean("student");
//        System.out.println(student);

        Classes classes = applicationContext.getBean(Classes.class);
        Classes classes2 = applicationContext.getBean(Classes.class);
        System.out.println(classes == classes2);


    }
}
