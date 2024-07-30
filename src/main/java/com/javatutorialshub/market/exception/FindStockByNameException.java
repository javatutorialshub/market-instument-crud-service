package com.javatutorialshub.market.exception;

public class FindStockByNameException extends Exception {
    public FindStockByNameException() {
    }

    public FindStockByNameException(String message) {
        super(message);
    }

    public FindStockByNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public FindStockByNameException(Throwable cause) {
        super(cause);
    }

    public FindStockByNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
