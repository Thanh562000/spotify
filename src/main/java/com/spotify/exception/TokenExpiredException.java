package com.spotify.exception;

public class TokenExpiredException extends RuntimeException {
    private String message;

    public TokenExpiredException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
