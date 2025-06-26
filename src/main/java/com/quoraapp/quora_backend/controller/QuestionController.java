package com.quoraapp.quora_backend.controller;

import com.quoraapp.quora_backend.models.Question;
import com.quoraapp.quora_backend.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public ResponseEntity<Question> askQuestion(@RequestBody Question question) {
        return ResponseEntity.ok(questionService.askQuestion(question));
    }

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Question>> getQuestionsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(questionService.getQuestionsByUserId(userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }
}
