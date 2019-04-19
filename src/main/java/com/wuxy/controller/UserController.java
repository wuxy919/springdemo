package com.wuxy.controller;

import com.wuxy.entity.User2;
import com.wuxy.service.UserService;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-18 15:39
 **/
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void findAll() {
        List<User2> list = userService.findAll();
        for (User2 user : list) {
            System.out.println(user);
        }
    }

    public User2 find(int id){
        User2 user = userService.find(id);
        System.out.println(user);
        return user;
    }

    public void save(User2 user){
        userService.save(user);
    }

    public void update(User2 user){
        userService.update(user);
    }

    public void delete(int id){
        userService.delete(id);
    }

}
