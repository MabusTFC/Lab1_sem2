package com.example.demo.om.example.demo.model;

import java.util.Date;
public class Post {
    private String text;
    private Integer likes = 0;

    private Date creationDate;
    private Long id;



    public Date getCreationDate(){return creationDate;}


    public Post(Long id, String text, Date creationDate){
        this.id= id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText(){
        return text;
    }


    public Integer getLikes(){
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public long getId(){
        return id;
    }
}
