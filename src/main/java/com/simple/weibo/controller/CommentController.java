package com.simple.weibo.controller;

import com.simple.weibo.entity.Comment;
import com.simple.weibo.service.CommentService;
import com.simple.weibo.util.ResponseData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Resource
    CommentService commentService;

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public ResponseData add(@RequestBody Comment comment) {
        commentService.insert(comment);
        return new ResponseData(comment);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        commentService.delete(id);
    }
}
