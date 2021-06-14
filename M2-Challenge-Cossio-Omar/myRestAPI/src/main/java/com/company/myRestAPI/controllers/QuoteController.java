package com.company.myRestAPI.controllers;

import com.company.myRestAPI.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

@RestController
public class QuoteController {

    Random rand = new Random();


    private static int id = 1;

    private static List<Quote> quotes = new ArrayList<>(Arrays.asList(
        new Quote(id++, "Mother Teresa", "Spread love everywhere you go. Let no one ever come to you without leaving happier"),
        new Quote(id++, "Franklin D. Roosevelt", "When you reach the end of your rope, tie a knot in it and hang on."),
        new Quote(id++, "Margaret Mead", "Always remember that you are absolutely unique. Just like everyone else."),
        new Quote(id++, "Robert Louis Stevenson", "Don't judge each day by the harvest you reap but by the seeds that you plant."),
        new Quote(id++, "Eleanor Roosevelt", "The future belongs to those who believe in the beauty of their dreams."),
        new Quote(id++, "Benjamin Franklin", "Tell me and I forget. Teach me and I remember. Involve me and I learn."),
        new Quote(id++, "Hellen Keller", "The best and most beautiful things in the world cannot be seen or even touched- they must be felt with the heart."),
        new Quote(id++, "Aristotle", "It is during our darkest moments that we must focus to see the light."),
        new Quote(id++, "Anne Frank", "Whoever is happy will make others happy too."),
        new Quote(id++, "Walt Disney", "The way to get started is to quit and begin doing.")
    ));


    @RequestMapping(value="/quote", method = RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Quote getRandomQuote() {
        int randomQuoteInt = rand.nextInt(quotes.size());
        return quotes.get(randomQuoteInt);
    }
}