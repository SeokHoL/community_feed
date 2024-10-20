package com.seokho.post.application.interfaces;

import com.seokho.post.domain.Post;

import java.util.Optional;

public interface PostRepository {

    Post save(Post post);

    Optional<Post> findById(Long id);
}
