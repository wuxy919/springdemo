package com.wuxy.service.impl;

import com.wuxy.entity.User2;
import com.wuxy.repository.UserRepository;
import com.wuxy.service.UserService;

import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-18 15:45
 **/
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User2> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User2 find(int id) {
        return userRepository.find(id);
    }

    @Override
    public void save(User2 user) {
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public void update(User2 user) {
        userRepository.update(user);
    }
}
