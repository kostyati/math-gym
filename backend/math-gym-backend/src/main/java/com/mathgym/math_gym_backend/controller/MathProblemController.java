package com.mathgym.math_gym_backend.controller;

import com.mathgym.math_gym_backend.model.MathProblem;
import com.mathgym.math_gym_backend.service.MathProblemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/problems")
public class MathProblemController {

    private final MathProblemService mathProblemService;

    public MathProblemController(MathProblemService mathProblemService) {
        this.mathProblemService = mathProblemService;
    }

    @GetMapping("/generate")
    public MathProblem generateProblem() {
        return mathProblemService.generateProblem();
    }
}
