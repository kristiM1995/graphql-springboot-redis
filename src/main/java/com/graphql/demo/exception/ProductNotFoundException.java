package com.graphql.demo.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
