package com.wuxy.factory;

import com.wuxy.entity.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wuxy
 * @create: 2019-04-18 14:24
 **/
public class StaticCarFactory {
    private static Map<Integer, Car> carMap;
    static {
        carMap = new HashMap<>();
        carMap.put(1, new Car(1, "奥迪"));
        carMap.put(2, new Car(2, "宝马"));
    }

    public static Car getCar(int num) {
        return carMap.get(num);
    }
}
