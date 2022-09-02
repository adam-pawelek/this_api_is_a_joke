package com.example.this_api_is_a_joke.data;

import com.example.this_api_is_a_joke.data.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokeRepository extends JpaRepository<Joke,Long> {

}
