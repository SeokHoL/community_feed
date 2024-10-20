package com.seokho.post.application.dto;

public record UpdateCommentRequestDto(Long commentId, Long userId, String content) {
}
