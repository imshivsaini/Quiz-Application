package com.quiz.Quiz_Application.Entity;

public class QuestionResult {

    private String questionText;
    private String correctAnswer;
    private boolean isCorrect;

    public QuestionResult(String questionText, String correctAnswer, boolean isCorrect) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.isCorrect = isCorrect;
    }

    public QuestionResult() {
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
