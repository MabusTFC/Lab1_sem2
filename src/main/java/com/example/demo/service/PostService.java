package com.example.demo.service;

import com.example.demo.om.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    //List<Post> posts;
    public List<Post> listAllPosts(){

         Post post1 = new Post("Бубубубуубуб");
         Post post2 = new Post("ФФЫФЫФЫФЫФЫФ");
         Post post3 = new Post("УРАУРАУРАУРА");
         List<Post> posts = new ArrayList<Post>();
         posts.add(post1);
         posts.add(post2);
         posts.add(post3);
         return posts;
    }


}
