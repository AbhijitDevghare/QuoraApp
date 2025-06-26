package com.quoraapp.quora_backend.service;

import com.quoraapp.quora_backend.models.Question;

import java.util.List;

public interface QuestionService {
    Question askQuestion(Question question);
    List<Question> getQuestionsByUserId(Long userId);
    List<Question> getAllQuestions();
    void deleteQuestion(Long id);
}
