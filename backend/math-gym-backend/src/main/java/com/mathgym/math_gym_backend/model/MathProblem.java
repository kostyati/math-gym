package com.mathgym.math_gym_backend.model;

public class MathProblem {

    private String problemStatement;
    private int correctAnswer;

    public MathProblem(String problemStatement, int correctAnswer) {
        this.problemStatement = problemStatement;
        this.correctAnswer = correctAnswer;
    }

    public String getProblemStatement() {
        return problemStatement;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString() {
        return problemStatement + " = ?";
    }

}
