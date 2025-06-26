package com.quoraapp.quora_backend.service;

import com.quoraapp.quora_backend.models.Question;
import com.quoraapp.quora_backend.repository.QuestionRepository;
import com.quoraapp.quora_backend.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question askQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuestionsByUserId(Long userId) {
        return questionRepository.findByUserId(userId);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}
