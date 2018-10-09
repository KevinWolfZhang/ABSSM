package com.simple.weibo.service.impl;

import com.simple.weibo.dao.CommentMapper;
import com.simple.weibo.entity.Comment;
import com.simple.weibo.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    CommentMapper commentMapper;

    @Override
    public int insert(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public int delete(int id) {
        return commentMapper.delete(id);
    }
}
