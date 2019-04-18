package com.wuxy.test;

import com.wuxy.entity.Car;
import com.wuxy.factory.InstanceCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wuxy
 * @create: 2019-04-18 14:29
 **/
public class Test5 {
    public static void main(String[] args) {
//        // 创建实例工厂对象
//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        // 通过实例工厂获取Car对象
//        Car car = instanceCarFactory.getCar(3);
//        System.out.println(car);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring4.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
}
