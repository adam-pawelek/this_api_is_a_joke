package com.example.this_api_is_a_joke.service;

import com.example.this_api_is_a_joke.data.Joke;
import com.example.this_api_is_a_joke.data.JokeRepository;
import com.example.this_api_is_a_joke.exception.IdNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public Joke updateJoke(Joke jokeToUpdate){
        if (jokeRepository.existsById(jokeToUpdate.getId())){
            return jokeRepository.save(jokeToUpdate);
        }else{
            throw new IdNotFoundException(jokeToUpdate.getId());
        }
    }

    public void deleteJoke(Long id){
        if (jokeRepository.existsById(id)){

            jokeRepository.deleteById(id);
        }else{
            throw new IdNotFoundException(id);
        }
    }


}
