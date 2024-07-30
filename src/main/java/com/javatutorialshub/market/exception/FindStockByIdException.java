package com.javatutorialshub.market.exception;

public class FindStockByIdException extends Exception {
    public FindStockByIdException() {
    }

    public FindStockByIdException(String message) {
        super(message);
    }

    public FindStockByIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public FindStockByIdException(Throwable cause) {
        super(cause);
    }

    public FindStockByIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
