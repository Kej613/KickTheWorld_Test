package com.example.kicktheworld_test.Cart.Exception;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String message) {
        super(message);
    }

}
