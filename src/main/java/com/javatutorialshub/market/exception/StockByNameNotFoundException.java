package com.javatutorialshub.market.exception;

public class StockByNameNotFoundException extends Exception {
    public StockByNameNotFoundException() {
    }

    public StockByNameNotFoundException(String message) {
        super(message);
    }

    public StockByNameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StockByNameNotFoundException(Throwable cause) {
        super(cause);
    }

    public StockByNameNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
