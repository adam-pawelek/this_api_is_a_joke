package com.example.this_api_is_a_joke.controller;


import com.example.this_api_is_a_joke.data.Joke;
import com.example.this_api_is_a_joke.data.JokeRepository;
import com.example.this_api_is_a_joke.service.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path =  "/joke")
public class JokeController {
    private final JokeService jokeService;

    @GetMapping()
    List<Joke> getJokes(){
        return jokeService.getJokes();
    }

    @PostMapping()
    Joke addJoke(Joke jokeToAdd){
        return jokeService.addJoke(jokeToAdd);
    }
}
