package com.wuxy.test;

import com.wuxy.entity.Classes;
import com.wuxy.entity.Student;
import com.wuxy.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wuxy
 * @create: 2019-04-18 12:53
 **/
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
//        User user = (User)applicationContext.getBean("user");
//        User user2 = (User)applicationContext.getBean("user2");
//        System.out.println(user);
//        System.out.println(user2);
        Student student = (Student)applicationContext.getBean("student");
        User user1 = (User)applicationContext.getBean("user1");
        System.out.println(student);
        System.out.println(user1);
    }
}
