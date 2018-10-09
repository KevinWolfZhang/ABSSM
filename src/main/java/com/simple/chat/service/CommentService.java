package com.simple.chat.service;

import com.simple.chat.entity.Comment;

public interface CommentService {
    int insert(Comment comment);
    int delete(int id);
}
