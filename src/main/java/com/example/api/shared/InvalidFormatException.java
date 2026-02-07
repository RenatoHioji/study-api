package com.example.api.shared;

public class InvalidFormatException extends RuntimeException{
    public InvalidFormatException(String message){
        super(message);
    }
}
