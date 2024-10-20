package com.seokho.post.application.interfaces;

import com.seokho.post.domain.Post;
import com.seokho.post.domain.comment.Comment;
import com.seokho.user.domain.User;

public interface LikeRepository {

    boolean checkLike(Post post, User user);
    void like(Post post, User user);
    void unlike(Post post, User user);

    boolean checkLike(Comment comment, User user);
    void like(Comment comment, User user);
    void unlike(Comment comment, User user);

}
