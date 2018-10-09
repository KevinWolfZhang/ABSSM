package com.simple.chat.service.impl;

import com.simple.chat.dao.CommentMapper;
import com.simple.chat.entity.Comment;
import com.simple.chat.service.CommentService;
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
