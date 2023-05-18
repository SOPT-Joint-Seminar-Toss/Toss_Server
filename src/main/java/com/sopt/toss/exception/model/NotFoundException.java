package com.sopt.toss.exception.model;

import com.sopt.toss.exception.Error;

public class NotFoundException extends TossException{

    public NotFoundException(Error error, String message) {
        super(error, message);
    }
}
