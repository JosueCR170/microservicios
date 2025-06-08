package com.una.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClientNotExistException extends RuntimeException {
    public ClientNotExistException(String message) {
        super(message);
    }
}
