package com.simple.weibo.service;

import com.simple.weibo.entity.Comment;

public interface CommentService {
    int insert(Comment comment);
    int delete(int id);
}
