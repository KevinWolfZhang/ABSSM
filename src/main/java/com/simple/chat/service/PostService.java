package com.simple.chat.service;

import com.simple.chat.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> findList();
    List<Post> postByUser(String userName);
    int insert(Post post);
    int delete(int id);
    int like(int id);
    int dislike(int id);
}
