package com.simple.chat.dao;

import com.simple.chat.entity.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int insert(Comment comment);
    int delete(@Param("id") int id);
}
