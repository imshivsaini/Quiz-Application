package com.quiz.Quiz_Application.Repository;

import com.quiz.Quiz_Application.Entity.QuizSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<QuizSession, Long> {
}
