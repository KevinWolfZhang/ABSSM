package com.simple.weibo.dao;

import com.simple.weibo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User select(@Param("name") String name);
    int userNameExits(@Param("name")String name);
    int accountValid(User user);
    int insert(User user);
}
