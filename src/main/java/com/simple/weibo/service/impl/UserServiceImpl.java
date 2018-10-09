package com.simple.weibo.service.impl;

import com.simple.weibo.dao.UserMapper;
import com.simple.weibo.entity.User;
import com.simple.weibo.service.UserService;
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
