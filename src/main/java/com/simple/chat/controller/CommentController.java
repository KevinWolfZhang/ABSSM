package com.simple.chat.controller;

import com.simple.chat.entity.Comment;
import com.simple.chat.service.CommentService;
import com.simple.chat.util.ResponseData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/comment")
public class CommentController {
    @Resource
    CommentService commentService;

    /*添加评论*/
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public ResponseData add(@RequestBody Comment comment) {
        commentService.insert(comment);
        return new ResponseData(comment);
    }

    /*删除评论*/
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        commentService.delete(id);
    }
}
