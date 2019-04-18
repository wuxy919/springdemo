package com.wuxy.test;

import com.wuxy.controller.UserController;
import com.wuxy.entity.Car;
import com.wuxy.entity.Person;
import com.wuxy.util.JDBCTools;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

/**
 * @author: wuxy
 * @create: 2019-04-18 14:29
 **/
public class Test6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mvc.xml");
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person);
//        Connection connection = JDBCTools.getConnection();
//        System.out.println(connection);
        UserController userController = (UserController)applicationContext.getBean("userController");
        userController.findAll();
    }
}
