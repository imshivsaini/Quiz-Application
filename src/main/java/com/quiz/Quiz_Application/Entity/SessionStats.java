package com.quiz.Quiz_Application.Entity;

import java.util.List;

public class SessionStats {
    private long correct;
    private long incorrect;
    private List<QuestionResult> questionResults;

    public SessionStats(long correct, long incorrect, List<QuestionResult> questionResults) {
        this.correct = correct;
        this.incorrect = incorrect;
        this.questionResults = questionResults;
    }

    public SessionStats() {
    }

    public long getCorrect() {
        return correct;
    }

    public void setCorrect(long correct) {
        this.correct = correct;
    }

    public long getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(long incorrect) {
        this.incorrect = incorrect;
    }

    public List<QuestionResult> getQuestionResults() {
        return questionResults;
    }

    public void setQuestionResults(List<QuestionResult> questionResults) {
        this.questionResults = questionResults;
    }
}
