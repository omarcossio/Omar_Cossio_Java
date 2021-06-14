package com.company.myRestAPI.controllers;

import com.company.myRestAPI.models.Definition;
import com.company.myRestAPI.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DefinitionController {
    Random rand = new Random();

    private static int id = 1;

    private static List<Definition> definitionList= new ArrayList<>(Arrays.asList(
            new Definition(id++, "Anfractuous", "full of windings and intricate turnings"),
            new Definition(id++, "Didactic", "Designed or intended to teach"),
            new Definition(id++, "Solipsism", "extreme egocentrism"),
            new Definition(id++, "Rigmarole", "confused or meaningless talk"),
            new Definition(id++, "Glean", "to gather grain or other produce left by reapers"),
            new Definition(id++, "Bumptious", "presumptuously, obtusely, and often noisily self-assertive"),
            new Definition(id++, "Majuscule", " a large letter (such as a capital)"),
            new Definition(id++, "Fustian", "a strong cotton and linen fabric"),
            new Definition(id++, "Conciliatory", "tending to win over from a state of hostility or distrust"),
            new Definition(id++, "Smorgasbord", "an often large heterogeneous mixture")
    ));

    @RequestMapping(value="/word", method = RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Definition getRandomDefinition() {
        int randomDefInt = rand.nextInt(definitionList.size());
        return definitionList.get(randomDefInt);
    }
}
