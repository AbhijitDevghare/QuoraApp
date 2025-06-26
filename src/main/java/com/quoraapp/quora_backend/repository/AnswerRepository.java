package com.quoraapp.quora_backend.repository;

import com.quoraapp.quora_backend.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByUserId(Long userId);           // ✅ Get answers by user
    List<Answer> findByQuestionId(Long questionId);   // ✅ Get answers by question
}

