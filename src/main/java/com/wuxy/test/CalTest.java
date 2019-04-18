package com.wuxy.test;

import com.wuxy.util.Cal;
import com.wuxy.util.CalImpl;
import com.wuxy.util.MyInvocationHandler;

/**
 * @author: wuxy
 * @create: 2019-04-18 17:14
 **/
public class CalTest {
    public static void main(String[] args) {
        // 创建委托对象
        Cal cal = new CalImpl();
        // 获取动态对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal cal1 = (Cal) myInvocationHandler.bind(cal);
        cal1.add(10, 3);
        cal1.sub(10, 3);
        cal1.mul(10, 3);
        cal1.div(10, 3);
    }
}
