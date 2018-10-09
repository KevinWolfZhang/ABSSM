package com.simple.chat.service;

import com.simple.chat.entity.User;

public interface UserService {
    User select(String name);
    int userNameExits(String name);
    boolean accountValid(User user);
    int insert(User user);
}
