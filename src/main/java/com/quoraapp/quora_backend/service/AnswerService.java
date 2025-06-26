package com.quoraapp.quora_backend.service;

import com.quoraapp.quora_backend.dto.AnswerDTO;
import com.quoraapp.quora_backend.models.Answer;

import java.util.List;

public interface AnswerService {
    Answer postAnswer(AnswerDTO answerDTO);
    List<Answer> getAnswersByQuestionId(Long questionId);
    List<Answer> getAnswersByUserId(Long userId);
    void deleteAnswer(Long id);
}
