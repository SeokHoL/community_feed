package com.seokho.post.domain.comment;

import com.seokho.common.domain.PositivenIntegerCounter;
import com.seokho.post.domain.content.CommentContent;
import com.seokho.post.domain.content.Content;
import com.seokho.post.domain.Post;
import com.seokho.user.domain.User;

public class Comment {

    private final Long id;
    private final Post post;
    private final User author;
    private final Content content;
    private final PositivenIntegerCounter likeCount;

    public static Comment createComment(Post post, User author, String content){
        return  new Comment(null,post, author, new CommentContent(content));
    }



    public Comment(Long id, Post post, User author, Content content) {
        if(author ==null){
            throw new IllegalArgumentException();
        }

        if (post == null) {
            throw new IllegalArgumentException();
        }

        if(content == null){
            throw new IllegalArgumentException();
        }


        this.id = id;
        this.post = post;
        this.author = author;
        this.content = content;
        this.likeCount = new PositivenIntegerCounter();
    }

    public void like(User user){
        if (this.author.equals(user)){
            throw new IllegalArgumentException();
        }

        likeCount.increase();
    }

    public void unlike(){
        this.likeCount.decrease();
    }

    public void updateComment(User user, String updateContent){
        if (!this.author.equals(user)){
            throw new IllegalArgumentException();
        }

        this.content.updateContent(updateContent);
    }

    public PositivenIntegerCounter getLikeCount() {
        return likeCount;
    }
}
