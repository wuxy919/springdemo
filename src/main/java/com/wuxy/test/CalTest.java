package com.wuxy.test;

import com.wuxy.util.Cal;
import com.wuxy.util.CalImpl;
import com.wuxy.util.MyInvocationHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wuxy
 * @create: 2019-04-18 17:14
 **/
public class CalTest {
    public static void main(String[] args) {
//        // 创建委托对象
//        Cal cal = new CalImpl();
//        // 获取动态对象
//        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
//        Cal cal1 = (Cal) myInvocationHandler.bind(cal);
//        cal1.add(10, 3);
//        cal1.sub(10, 3);
//        cal1.mul(10, 3);
//        cal1.div(10, 3);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        Cal cal = (Cal)applicationContext.getBean("calImpl");
        cal.add(10, 3);
        cal.sub(10, 3);
        cal.mul(10, 3);
        cal.div(10, 3);
    }
}
