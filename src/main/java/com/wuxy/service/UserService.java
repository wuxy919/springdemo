package com.wuxy.service;

import com.wuxy.entity.User2;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-18 15:40
 **/
public interface UserService {
    public List<User2> findAll();
    public User2 find(int id);
    public void save(User2 user);
    public void delete(int id);
    public void update(User2 user);
}
