package com.seokho.post.domain;

import com.seokho.common.domain.PositivenIntegerCounter;
import com.seokho.post.domain.content.Content;
import com.seokho.post.domain.content.PostContent;
import com.seokho.post.domain.content.PostPublicationState;
import com.seokho.user.domain.User;

public class Post {

    private final Long id;
    private final User author;
//    private final Long authorId;
    private final Content content;
    private final PositivenIntegerCounter likeCount;
    private PostPublicationState state;

    public static Post createPost(Long id, User author, String content, PostPublicationState state){
        return new Post(id, author, new PostContent(content),state);
    }
    public static Post createDefaultPost(Long id, User author, String content){
        return new Post(id, author, new PostContent(content), PostPublicationState.PUBLIC);
    }

    public Post(Long id, User author, Content content){
        this(id,author,content,PostPublicationState.PUBLIC);
    }

    public Post(Long id, User author, Content content,PostPublicationState state) {
        if (author==null){
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.author = author;
//        this.authorId =author.getId();
        this.content = content;
        this.likeCount = new PositivenIntegerCounter();
        this.state = state;
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

    public void updatePost(User user,String updateContent,PostPublicationState state){
        if (!this.author.equals(user)){
            throw new IllegalArgumentException();
        }
        this.state=state;
        this.content.updateContent(updateContent);
    }

    public int getLikeCount(){
        return likeCount.getCount();
    }

    public String getContent() {
        return content.getContentText();
    }

}
