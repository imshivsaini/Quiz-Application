package com.quiz.Quiz_Application.Repository;

import com.quiz.Quiz_Application.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
