package com.quoraapp.quora_backend.service;

import com.quoraapp.quora_backend.dto.AnswerDTO;
import com.quoraapp.quora_backend.models.Answer;
import com.quoraapp.quora_backend.models.User;
import com.quoraapp.quora_backend.models.Question;
import com.quoraapp.quora_backend.repository.AnswerRepository;
import com.quoraapp.quora_backend.repository.UserRepository;
import com.quoraapp.quora_backend.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Answer postAnswer(AnswerDTO dto) {
        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Question question = questionRepository.findById(dto.getQuestionId())
                .orElseThrow(() -> new RuntimeException("Question not found"));

        Answer answer = new Answer();
        answer.setBody(dto.getBody());
        answer.setUser(user);
        answer.setQuestion(question);
        answer.setCreatedAt(LocalDateTime.now());
        answer.setUpdatedAt(LocalDateTime.now());

        return answerRepository.save(answer);
    }

    @Override
    public List<Answer> getAnswersByQuestionId(Long questionId) {
        return answerRepository.findByQuestionId(questionId);
    }

    @Override
    public List<Answer> getAnswersByUserId(Long userId) {
        return answerRepository.findByUserId(userId);
    }

    @Override
    public void deleteAnswer(Long id) {
        answerRepository.deleteById(id);
    }
}
