package com.quiz.Quiz_Application.Service;

import com.quiz.Quiz_Application.Entity.Question;
import com.quiz.Quiz_Application.Entity.QuestionResult;
import com.quiz.Quiz_Application.Entity.QuizSession;
import com.quiz.Quiz_Application.Entity.SessionStats;
import com.quiz.Quiz_Application.Repository.QuestionRepository;
import com.quiz.Quiz_Application.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    // NEW SESSION

    public QuizSession startNewSession(Long userId) {
        QuizSession session = new QuizSession();
        session.setUserId(userId);
        session.setStartTime(LocalDateTime.now());
        session.setQuestionsAnswered(new HashMap<>());
        return quizRepository.save(session);
    }

    // GET RANDOM QUESTION
    public Question getRandomQuestion(Long sessionId) {
        List<Question> questions = questionRepository.findAll();

        if (questions.isEmpty()) {
            throw new RuntimeException("No questions available in the database");
        }
        return questions.get(new Random().nextInt(questions.size()));
    }

    // SUBMIT ANSWER
    public boolean submitAnswer(Long sessionId, Long questionId, String answer) {
        Optional<Question> question = questionRepository.findById(questionId);
        if (question.isPresent()) {
            String correctAnswer = question.get().getCorrectAnswer().trim();
            boolean isCorrect = correctAnswer.equalsIgnoreCase(answer.trim());
            QuizSession session = quizRepository.findById(sessionId).orElseThrow();
            session.getQuestionsAnswered().put(questionId, isCorrect);
            quizRepository.save(session);
            return isCorrect;
        }
        throw new RuntimeException("Question not found");
    }
// STATS
    public SessionStats getSessionStats(Long sessionId) {
        QuizSession session = quizRepository.findById(sessionId).orElseThrow();
        Map<Long, Boolean> answers = session.getQuestionsAnswered();
        long correct = answers.values().stream().filter(Boolean::booleanValue).count();
        long incorrect = answers.size() - correct;
        List<QuestionResult> questionResults = answers.entrySet().stream()
                .map(entry -> {
                    Question question = questionRepository.findById(entry.getKey()).orElse(null);
                    return new QuestionResult(question.getQuestionText(), question.getCorrectAnswer(), entry.getValue());
                }).collect(Collectors.toList());
        return new SessionStats(correct, incorrect, questionResults);
    }

}
