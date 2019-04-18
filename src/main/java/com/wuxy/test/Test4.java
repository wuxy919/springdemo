package com.wuxy.test;

import com.wuxy.entity.Car;
import com.wuxy.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wuxy
 * @create: 2019-04-18 14:29
 **/
public class Test4 {
    public static void main(String[] args) {
//        Car car = StaticCarFactory.getCar(2);
//        System.out.println(car);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
}
