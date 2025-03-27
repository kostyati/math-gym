package com.mathgym.math_gym_backend.service;

import org.springframework.stereotype.Service;

import com.mathgym.math_gym_backend.model.MathProblem;

import java.util.Random;

@Service
public class MathProblemService {
    private final Random random = new Random();

    public MathProblem generateProblem() {
        int num1 = random.nextInt(10) + 1; // Random number 1-10
        int num2 = random.nextInt(10) + 1; // Random number 1-10
        char operator = randomOperator();

        int correctAnswer = calculateAnswer(num1, num2, operator);
        String problemStatement = num1 + " " + operator + " " + num2;

        return new MathProblem(problemStatement, correctAnswer);
    }

    private char randomOperator() {
        char[] operators = {'+', '-', '*'};
        return operators[random.nextInt(operators.length)];
    }

    private int calculateAnswer(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> 0;
        };
    }
}
