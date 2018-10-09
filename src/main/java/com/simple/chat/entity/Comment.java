package com.simple.chat.entity;

import java.util.Date;

public class Comment {
    private int id;
    private Date cDate;
    private String cContent;
    private String cAuthorName;
    private int postId;
    private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getcAuthorName() {
        return cAuthorName;
    }

    public void setcAuthorName(String cAuthorName) {
        this.cAuthorName = cAuthorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
}
