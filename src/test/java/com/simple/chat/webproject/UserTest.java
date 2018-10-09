package com.simple.chat.webproject;

import com.simple.chat.entity.User;
import com.simple.chat.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest {
    @Resource
    UserService us;

    @Test
    public void testAdd() {
        User user = new User();
        user.setName("test");
        user.setPwd("testpw");
        int res = us.insert(user);
        System.out.println(res);
    }

    @Test
    public void testAccountValid() {
        User user = new User();
        user.setName("test");
        user.setPwd("testpw");
        boolean res = us.accountValid(user);
        System.out.println(res);
    }
}
