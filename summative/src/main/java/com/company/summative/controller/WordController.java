package com.company.summative.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.company.summative.models.Definition;


@RestController
public class WordController {
    private List<Definition> wordList;

    public WordController() {
        Definition word1 = new Definition(1);
        Definition word2 = new Definition(2);
        Definition word3 = new Definition(3);
        Definition word4 = new Definition(4);
        Definition word5 = new Definition(5);
        Definition word6 = new Definition(6);
        Definition word7 = new Definition(7);
        Definition word8 = new Definition(8);
        Definition word9 = new Definition(9);
        Definition word10 = new Definition(10);

        word1.setWord("Debunk");
        word1.setDefinition("expose the falseness or hollowness of (a myth, idea, or belief)");
        
        word2.setWord("Forlon");
        word2.setDefinition("pitifully sad and abandoned or lonely");

        word3.setWord("Hamster");
        word3.setDefinition("a solitary burrowing rodent with a short tail and large cheek pouches for carrying food, native to Europe and northern Asia.");

        word4.setWord("Guppy");
        word4.setDefinition("a small, livebearing freshwater fish widely kept in aquariums. Native to tropical America, it has been introduced elsewhere to control mosquito larvae.");

        word5.setWord("Ecstatic");
        word5.setDefinition("feeling or expressing overwhelming happiness or joyful excitement.");

        word6.setWord("Electric");
        word6.setDefinition("having or producing a sudden sense of thrilling excitement.");

        word7.setWord("Accoutrement");
        word7.setDefinition("additional items of dress or equipment, or other items carried or worn by a person or used for a particular activity.");

        word8.setWord("Paraphernalia");
        word8.setDefinition("miscellaneous articles, especially the equipment needed for a particular activity.");

        word9.setWord("Apparatus");
        word9.setDefinition("a complex structure within an organization or system.");

        word10.setWord("Repentant");
        word10.setDefinition("expressing or feeling sincere regret and remorse; remorseful.");

        wordList = Arrays.asList(word1, word2, word3, word4, word5, word6, word7, word8, word9, word10);
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getWord() {
        int id = (int) (Math.random() * 10) + 1;
        return wordList.get(id);
    }
}

