package com.wuxy.factory;

import com.wuxy.entity.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wuxy
 * @create: 2019-04-18 14:24
 **/
public class InstanceCarFactory {
    private static Map<Integer, Car> carMap;
    public InstanceCarFactory() {
        carMap = new HashMap<>();
        carMap.put(1, new Car(1, "奥迪"));
        carMap.put(2, new Car(2, "宝马"));
        carMap.put(3, new Car(3, "奔驰"));
    }

    public Car getCar(int num) {
        return carMap.get(num);
    }
}
