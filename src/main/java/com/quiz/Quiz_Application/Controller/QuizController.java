package com.quiz.Quiz_Application.Controller;


import com.quiz.Quiz_Application.Entity.Question;
import com.quiz.Quiz_Application.Entity.QuizSession;
import com.quiz.Quiz_Application.Entity.SessionStats;
import com.quiz.Quiz_Application.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/test")
    public String test(){
        return "HI THERE ITS WORKINGT";
    }

    @PostMapping("/start")
    public ResponseEntity<QuizSession> startQuizSession(@RequestParam Long userId) {
        return ResponseEntity.ok(quizService.startNewSession(userId));
    }

    @GetMapping("/question")
    public ResponseEntity<Question> getRandomQuestion(@RequestParam Long sessionId) {
        return ResponseEntity.ok(quizService.getRandomQuestion(sessionId));
    }

    @PostMapping("/answer")
    public ResponseEntity<String> submitAnswer(@RequestParam Long sessionId, @RequestParam Long questionId, @RequestParam String answer) {
        boolean isCorrect = quizService.submitAnswer(sessionId, questionId, answer);
        return ResponseEntity.ok(isCorrect ? "Correct Answer" : "Incorrect Answer");
    }

    @GetMapping("/stats")
    public ResponseEntity<SessionStats> getSessionStats(@RequestParam Long sessionId) {
        return ResponseEntity.ok(quizService.getSessionStats(sessionId));
    }

}
