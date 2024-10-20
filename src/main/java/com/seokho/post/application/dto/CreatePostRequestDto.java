package com.seokho.post.application.dto;

import com.seokho.post.domain.content.PostPublicationState;

public record CreatePostRequestDto(Long userId, String content, PostPublicationState state) {
}
