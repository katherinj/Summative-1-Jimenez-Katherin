package com.company.summative.controller;
import com.company.summative.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AnswerController {
    private List<Answer> answerList = new ArrayList<>();
    int idCounter = 0;

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer addAnswer(@RequestBody String question) {
        Answer a = new Answer(question, idCounter++);
        answerList.add(a);
        return a;
    }
}
