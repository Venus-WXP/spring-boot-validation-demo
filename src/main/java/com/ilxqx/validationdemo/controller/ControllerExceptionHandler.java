package com.ilxqx.validationdemo.controller;

import com.ilxqx.validationdemo.pojo.Result;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * controller exception handler
 *
 * @author venus
 * @version 1.0.0
 * @since 2023/3/24 星期五 23:03
 */
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleValidationException(MethodArgumentNotValidException exception) {
        return Result.of(1, exception.getBindingResult().getFieldError().getDefaultMessage());
    }
}
