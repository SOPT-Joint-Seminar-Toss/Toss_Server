package com.sopt.toss.exception.model;

import com.sopt.toss.exception.Error;

public class ServerErrorException extends TossException{

    public ServerErrorException(Error error, String message) {
        super(error, message);
    }
}
