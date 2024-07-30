package com.javatutorialshub.market.exception;

public class DeleteStockByIdException extends Exception {
    public DeleteStockByIdException() {
    }

    public DeleteStockByIdException(String message) {
        super(message);
    }

    public DeleteStockByIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteStockByIdException(Throwable cause) {
        super(cause);
    }

    public DeleteStockByIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
