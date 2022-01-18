package com.aliergul.coursecatalogservice.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundRunTimeError extends RuntimeException{
    public NotFoundRunTimeError(String message) {
        super(message);
    }

    public NotFoundRunTimeError(String message, Throwable cause) {
        super(message, cause);
    }
}
