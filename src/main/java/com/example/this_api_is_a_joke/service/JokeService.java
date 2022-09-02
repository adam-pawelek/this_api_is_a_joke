package com.example.this_api_is_a_joke.service;

import com.example.this_api_is_a_joke.data.Joke;
import com.example.this_api_is_a_joke.data.JokeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JokeService {
    private final JokeRepository jokeRepository;

    public List<Joke> getJokes(){
        return jokeRepository.findAll();
    }

    public Joke addJoke(Joke jokeToAdd){
        return jokeRepository.save(jokeToAdd);
    }


}
