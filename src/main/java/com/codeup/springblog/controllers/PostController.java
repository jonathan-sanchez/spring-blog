package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts(){
        return "This is the posts index page!";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable int id){
        return "Your post id is " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "This is the create post form!";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String newPost(){
        return "Create a new post.";
    }
}
