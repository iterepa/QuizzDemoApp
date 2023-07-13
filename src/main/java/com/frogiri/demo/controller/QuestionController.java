package com.frogiri.demo.controller;

import com.frogiri.demo.Model.Question;
import com.frogiri.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }


    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
