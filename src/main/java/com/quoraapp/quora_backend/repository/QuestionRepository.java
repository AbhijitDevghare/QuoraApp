package com.quoraapp.quora_backend.repository;

import com.quoraapp.quora_backend.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByUserId(Long userId);  // ✅ Get questions by user
}
