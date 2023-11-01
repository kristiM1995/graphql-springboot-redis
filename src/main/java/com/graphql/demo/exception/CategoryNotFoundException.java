package com.graphql.demo.exception;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
