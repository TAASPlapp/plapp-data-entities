package com.plapp.entities.exceptions;

public class ActorNotFoundException extends Exception {
    public ActorNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
