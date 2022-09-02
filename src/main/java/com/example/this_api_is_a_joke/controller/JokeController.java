package com.example.this_api_is_a_joke.controller;


import com.example.this_api_is_a_joke.data.Joke;
import com.example.this_api_is_a_joke.data.JokeRepository;
import com.example.this_api_is_a_joke.service.JokeService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteJoke(@PathVariable(value = "id") Long id){
        System.out.println(id);
        jokeService.deleteJoke(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
