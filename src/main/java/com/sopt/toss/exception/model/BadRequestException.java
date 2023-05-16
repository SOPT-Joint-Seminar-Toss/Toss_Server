package com.sopt.toss.exception.model;

import com.sopt.toss.exception.Error;

public class BadRequestException extends TossException{

    public BadRequestException(Error error, String message) {
        super(error, message);
    }
}
