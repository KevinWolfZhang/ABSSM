package com.simple.weibo.controller;

import com.simple.weibo.entity.Post;
import com.simple.weibo.service.PostService;
import com.simple.weibo.util.ResponseData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {
    @Resource
    PostService postService;

    @ResponseBody
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public ResponseData findList() {
        List<Post> list = postService.findList();
        return new ResponseData(list);
    }

    @ResponseBody
    @RequestMapping(value = "/show/{userName}",method = RequestMethod.GET)
    public ResponseData findList(@PathVariable("userName")String userName) {
        List<Post> list = postService.postByUser(userName);
        return new ResponseData(list);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public int delete(@PathVariable("id")int id) {
        int res = postService.delete(id);
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public ResponseData add(@RequestBody Post post) {
        postService.insert(post);
        return new ResponseData(post);
    }

    @ResponseBody
    @RequestMapping(value = "/likes/{id}/{flag}",method = RequestMethod.GET)
    public void likeOrDislike(@PathVariable("id") int id, @PathVariable("flag") boolean flag) {
        if (flag) {
            postService.like(id);
        } else {
            postService.dislike(id);
        }
    }
}
