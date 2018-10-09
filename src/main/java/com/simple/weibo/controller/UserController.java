package com.simple.weibo.controller;

import com.simple.weibo.entity.User;
import com.simple.weibo.service.UserService;
import com.simple.weibo.util.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseData findUser(@PathVariable("name")String name){
        User user = userService.select(name);
        return new ResponseData(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseData accountValid(@RequestBody User user) {
        boolean res = userService.accountValid(user);
        return new ResponseData(res);

    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseData insert(@RequestBody User user) {
        userService.insert(user);
        return new ResponseData(user);
    }
}
