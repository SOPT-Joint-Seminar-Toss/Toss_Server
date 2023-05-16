package com.sopt.toss.exception.model;

import com.sopt.toss.exception.Error;
import lombok.Getter;

@Getter
public class TossException extends RuntimeException {
    private final Error error;

    public TossException(Error error, String message) {
        super(message);
        this.error = error;
    }

    public int getHttpStatus() {
        return error.getHttpStatusCode();
    }
}

