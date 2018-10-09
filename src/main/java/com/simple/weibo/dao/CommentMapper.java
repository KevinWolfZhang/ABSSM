package com.simple.weibo.dao;

import com.simple.weibo.entity.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int insert(Comment comment);
    int delete(@Param("id") int id);
}
