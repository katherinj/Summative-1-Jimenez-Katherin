package com.company.summative.controller;

import com.company.summative.models.Answer;
import com.company.summative.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private List<Quote> quoteList;

    public QuoteController(){
        quoteList = new ArrayList<>();

        quoteList.add(new Quote("Albert Einstein", "Learn from yesterday, live for today and hope for tomorrow. The important thing is not to stop questioning", 1));
        quoteList.add(new Quote("Bridget Torres", "You are like lemons, so sour", 2));
        quoteList.add(new Quote("Henry Ford", "Whether you think you can, or you think you can't – you're right", 3));
        quoteList.add(new Quote("Phyllis Dillers", "Never go to bed mad. Stay up and fight", 4));
        quoteList.add(new Quote("Mark Twain", "I did not attend his funeral, but I sent a nice letter saying I approved of it.", 5));
        quoteList.add(new Quote("Walt Disney", "All our dreams can come true, if we have the courage to pursue them", 6));
        quoteList.add(new Quote("Chinese Proverb", "The best time to plant a tree was 20 years ago. The second best time is now", 7));
        quoteList.add(new Quote("Eleanor Roosevelt", "Do what you feel in your heart to be right―for you’ll be criticized anyway.", 8));
        quoteList.add(new Quote("S. O’Sade", "Oh! It’s Friday again. Share the love that was missing during the week. In a worthy moment of peace and bliss", 9));
        quoteList.add(new Quote("Napoleon Hill", "If you cannot do great things, do small things in a great way.", 10));
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(quoteList.size());
        Quote randomQuote = quoteList.get(randomIndex);
        return randomQuote;
    }
}