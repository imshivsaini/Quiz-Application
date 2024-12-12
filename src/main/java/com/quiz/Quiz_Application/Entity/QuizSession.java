package com.quiz.Quiz_Application.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Entity
public class QuizSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private LocalDateTime startTime;

    @ElementCollection
    private Map<Long, Boolean> questionsAnswered;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Long, Boolean> getQuestionsAnswered() {
        return questionsAnswered;
    }

    public void setQuestionsAnswered(Map<Long, Boolean> questionsAnswered) {
        this.questionsAnswered = questionsAnswered;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
