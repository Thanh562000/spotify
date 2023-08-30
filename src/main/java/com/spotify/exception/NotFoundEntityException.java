package com.spotify.exception;


/*
 * @project_name: spotify_backend
 * @package: com.spotify.exception
 * @author: Admin
 * @version: v1.0
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundEntityException extends RuntimeException {
    private  String message;

    public NotFoundEntityException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public NotFoundEntityException(String message) {
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
