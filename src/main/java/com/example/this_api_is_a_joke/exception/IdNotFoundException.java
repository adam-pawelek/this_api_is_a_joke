package com.example.this_api_is_a_joke.exception;

public class IdNotFoundException extends IllegalArgumentException{
    public static final String ID_NOT_FOUND_MESSAGE = "ID not found: %d";


    public IdNotFoundException(Long id) {
        super(String.format(ID_NOT_FOUND_MESSAGE,id));
    }
}
