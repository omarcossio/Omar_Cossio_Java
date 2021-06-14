package com.company.myRestAPI.controllers;

import com.company.myRestAPI.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {
    Random rand = new Random();

    private static List<Answer> answerList = new ArrayList<>(Arrays.asList(
            new Answer(1, "", "It is certain"),
            new Answer(2, "", "My sources say no"),
            new Answer(3, "", "As I see it, yes"),
            new Answer(4, "", "Don't count on it"),
            new Answer(5, "", "Signs point to yes"),
            new Answer(6, "", "Very doubtful"),
            new Answer(7, "", "Outlook is good"),
            new Answer(8, "", "Ask again later"),
            new Answer(9, "", "You may rely on it"),
            new Answer(10, "", "Better not tell you now")
    ));

    @RequestMapping(value= "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer magicAnswer(@RequestBody String question) {
        int magicAnswerInt = rand.nextInt(answerList.size());
        answerList.get(magicAnswerInt).setQuestion((question));
        return answerList.get(magicAnswerInt);
    }
}
