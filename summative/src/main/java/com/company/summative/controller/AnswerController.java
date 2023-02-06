package com.company.summative.controller;
import com.company.summative.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AnswerController {
    private String[] potentialAnswers = {
            "Signs point to yes",
            "My reply is no.",
            "Concentrate and ask again",
            "It is certain",
            "Outlook not so good",
            "My sources say no"
    };

    private List<Answer> answerList = new ArrayList<>();
    int idCounter = 0;

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer addAnswer(@RequestBody String question) {
        if(question == "")
            throw new IllegalArgumentException("You must provide a question in order to receive an answer.");

        Answer a = new Answer();
        a.setId(idCounter++);
        a.setQuestion(question);
        a.setAnswer(potentialAnswers[(int)(Math.random() * ((potentialAnswers.length-1) + 1))]);
        answerList.add(a);
        return a;
    }
}
