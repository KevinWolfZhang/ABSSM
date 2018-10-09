package com.simple.chat.service.impl;

import com.simple.chat.dao.UserMapper;
import com.simple.chat.entity.User;
import com.simple.chat.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User select(String name) {
        return userMapper.select(name);
    }

    @Override
    public int userNameExits(String name) {
        return userMapper.userNameExits(name);
    }

    @Override
    public boolean accountValid(User user) {
        return userMapper.accountValid(user)>0;
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
