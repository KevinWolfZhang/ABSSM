package com.simple.weibo.service.impl;

import com.simple.weibo.dao.PostMapper;
import com.simple.weibo.entity.Post;
import com.simple.weibo.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Resource
    PostMapper postMapper;

    @Override
    public List<Post> findList() {
        return postMapper.findList();
    }

    @Override
    public List<Post> postByUser(String userName) {
        return postMapper.postByUser(userName);
    }

    @Override
    public int insert(Post post) {
        return postMapper.insert(post);
    }

    @Override
    public int delete(int id) {
        return postMapper.delete(id);
    }

    @Override
    public int like(int id) {
        postMapper.changeliked(id);
        return postMapper.like(id);
    }

    @Override
    public int dislike(int id) {
        postMapper.changeliked(id);
        int i = postMapper.dislike(id);
        return i;
    }
}
