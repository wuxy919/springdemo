package com.wuxy.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author: wuxy
 * @create: 2019-04-18 18:17
 **/
public class MyInvocationHandler implements InvocationHandler {

    // 委托对象
    private Object object = null;

    // 返回代理对象
    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() +"参数是"+ Arrays.toString(args));
        Object result = method.invoke(this.object, args);
        System.out.println(method.getName() +"结果是"+ result);
        return result;
    }
}