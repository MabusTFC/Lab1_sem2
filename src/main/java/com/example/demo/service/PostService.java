package com.example.demo.service;

import com.example.demo.om.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    List<Post> posts;
    {
         posts = new ArrayList<>();
         Post post1 = new Post((long)listAllPosts().size(),"Бубубубуубуб", new Date(124, Calendar.DECEMBER,11));
         Post post2 = new Post((long)listAllPosts().size(),"ФФЫФЫФЫФЫФЫФ", new Date(104,Calendar.FEBRUARY,25));
         Post post3 = new Post((long)listAllPosts().size(),"УРАУРАУРАУРА", new Date(123,Calendar.SEPTEMBER,14));
         posts.add(post1);
         posts.add(post2);
         posts.add(post3);

    }
    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post((long)listAllPosts().size(),text, new Date()));
    }
}
