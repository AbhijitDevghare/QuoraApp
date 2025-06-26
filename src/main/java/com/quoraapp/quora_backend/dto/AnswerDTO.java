package com.quoraapp.quora_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AnswerDTO {
    @NotBlank(message = "Answer body cannot be blank")
    private String body;

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Question ID is required")
    private Long questionId;

    // Getters and Setters
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getQuestionId() { return questionId; }
    public void setQuestionId(Long questionId) { this.questionId = questionId; }
}
