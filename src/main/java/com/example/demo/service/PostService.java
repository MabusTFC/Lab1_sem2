package com.example.demo.service;

import com.example.demo.om.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {

    /*List<Post> posts;
    {
         posts = new ArrayList<>();
         Post post1 = new Post((long)listAllPosts().size(),"Бубубубуубуб", new Date(124, Calendar.DECEMBER,11));
         Post post2 = new Post((long)listAllPosts().size(),"ФФЫФЫФЫФЫФЫФ", new Date(104,Calendar.FEBRUARY,25));
         Post post3 = new Post((long)listAllPosts().size(),"УРАУРАУРАУРА", new Date(123,Calendar.SEPTEMBER,14));
         posts.add(post1);
         posts.add(post2);
         posts.add(post3);

    }*/
    @Autowired
    PostRepository postRepository;
    public List<Post> listAllPosts(){
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }
    public void create(String text) {
        //posts.add(new Post((long)listAllPosts().size(),text, new Date()));
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
