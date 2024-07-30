package com.javatutorialshub.market.exception;

public class CreateStockException extends Exception {
    public CreateStockException() {
    }

    public CreateStockException(String message) {
        super(message);
    }

    public CreateStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateStockException(Throwable cause) {
        super(cause);
    }

    public CreateStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
