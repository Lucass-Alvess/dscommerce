package com.lucasdev.dscommerce.services.exceptions;

public class ForbiddenExeception extends RuntimeException {

    public ForbiddenExeception(String message) {
        super(message);
    }
}
