package com.simple.chat.controller;

import com.simple.chat.entity.User;
import com.simple.chat.service.UserService;
import com.simple.chat.util.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    UserService userService;

    /*验证用户是否存在*/
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseData findUser(@PathVariable("name")String name){
        User user = userService.select(name);
        return new ResponseData(user);
    }

    /*判断用户名密码是否正确 登录*/
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseData accountValid(@RequestBody User user) {
        boolean res = userService.accountValid(user);
        return new ResponseData(res);

    }

    /*新建用户*/
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseData insert(@RequestBody User user) {
        userService.insert(user);
        return new ResponseData(user);
    }
}
