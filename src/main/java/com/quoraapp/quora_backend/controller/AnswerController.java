package com.quoraapp.quora_backend.controller;

import com.quoraapp.quora_backend.dto.AnswerDTO;
import com.quoraapp.quora_backend.models.Answer;
import com.quoraapp.quora_backend.service.AnswerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping
    public ResponseEntity<Answer> postAnswer(@Valid @RequestBody AnswerDTO dto) {
        return ResponseEntity.ok(answerService.postAnswer(dto));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Answer>> getAnswersByUserId(@PathVariable Long userId) {
        List<Answer> answers = answerService.getAnswersByUserId(userId);
        return ResponseEntity.ok(answers);
    }


}
