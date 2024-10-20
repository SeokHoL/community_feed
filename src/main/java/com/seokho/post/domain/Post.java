package com.seokho.post.domain;

import com.seokho.user.domain.User;

public class Post {

    private final User author;
    private final String content;

    public Post(User author, String content) {
        if (author==null){
            throw new IllegalArgumentException();
        }

        if(content==null|| content.length() < 5 || content.length() >500){
            throw new IllegalArgumentException();
        }



        this.author = author;
        this.content = content;
    }
}
