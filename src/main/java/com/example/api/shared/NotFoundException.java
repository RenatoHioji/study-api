package com.example.api.shared;

public class NotFoundException extends BussinessException{
    public NotFoundException(String message){
        super(message);
    }
}
