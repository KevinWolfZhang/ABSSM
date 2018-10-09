package com.simple.weibo.service;

import com.simple.weibo.entity.User;

public interface UserService {
    User select(String name);
    int userNameExits(String name);
    boolean accountValid(User user);
    int insert(User user);
}
