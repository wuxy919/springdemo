package com.wuxy.test;

import com.wuxy.entity.Car;
import com.wuxy.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wuxy
 * @create: 2019-04-18 14:29
 **/
public class Test6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring5.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
