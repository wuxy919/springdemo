package com.wuxy.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: wuxy
 * @create: 2019-04-18 09:27
 **/
public class MyClassPathXmlApplicationContext implements MyApplicationContext {

    private Map<String, Object> ioc = new HashMap<>();

    public MyClassPathXmlApplicationContext(String path) {
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read("src/main/resources/" + path);
            Element root = document.getRootElement();
            Iterator<Element> iterator = root.elementIterator();
            while (iterator.hasNext()) {
                Element bean = iterator.next();
                String className = bean.attributeValue("class");
                try {
                    Class clazz = Class.forName(className);
                    Constructor constructor = clazz.getConstructor();
                    Object object = constructor.newInstance();
                    // 给对象赋值
                    Iterator<Element> beanIterator = bean.elementIterator();
                    while (beanIterator.hasNext()) {
                        Element property = beanIterator.next();
                        String propertyName = property.attributeValue("name");
                        String value = property.attributeValue("value");
                        String methodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
                        Field field = clazz.getDeclaredField(propertyName);
                        Object val = null;
                        switch (field.getType().getName()) {
                            case "int":
                                val = Integer.parseInt(value);
                                break;
                            case "java.lang.String":
                                val = value;
                                break;
                        }
                        Method method = clazz.getMethod(methodName, field.getType());
                        method.invoke(object, val);
                    }
                    String id = bean.attributeValue("id");
                    ioc.put(id, object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Object getBean(String id) {
        return ioc.get(id);
    }
}
