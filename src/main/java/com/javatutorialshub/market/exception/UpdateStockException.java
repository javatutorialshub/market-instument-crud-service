package com.javatutorialshub.market.exception;

public class UpdateStockException extends Exception {
    public UpdateStockException() {
    }

    public UpdateStockException(String message) {
        super(message);
    }

    public UpdateStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateStockException(Throwable cause) {
        super(cause);
    }

    public UpdateStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
