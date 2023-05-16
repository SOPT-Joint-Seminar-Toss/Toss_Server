package com.sopt.toss.common.advice;

import com.sopt.toss.common.dto.ApiResponse;
import com.sopt.toss.exception.model.TossException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ControllerExceptionAdvice {
    /**
     * Sopt custom error
     */
    @ExceptionHandler(TossException.class)
    protected ResponseEntity<ApiResponse> handleSoptException(TossException e) {
        return ResponseEntity.status(e.getHttpStatus())
                .body(ApiResponse.error(e.getError(), e.getMessage()));
    }
}
