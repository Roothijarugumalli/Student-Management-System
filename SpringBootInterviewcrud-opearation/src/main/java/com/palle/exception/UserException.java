package com.palle.exception;



import org.springframework.http.HttpStatus;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class UserException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> exceptionHandling(MethodArgumentNotValidException ex) {

        Map<String, String> map = new HashMap<>();

        ex.getBindingResult()
          .getFieldErrors()
          .forEach(err -> map.put(err.getField(), err.getDefaultMessage()));

        return map;
       
    }
    // 2. NOT FOUND errors (ADD THIS)
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound(ResourceNotFoundException ex) {
        return ex.getMessage();
    }
    
}