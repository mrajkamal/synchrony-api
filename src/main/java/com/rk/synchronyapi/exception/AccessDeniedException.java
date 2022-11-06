package com.rk.synchronyapi.exception;

public class AccessDeniedException extends RuntimeException{

    public AccessDeniedException(String message){
        super(message);
    }
}
