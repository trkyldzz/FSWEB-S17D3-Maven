package com.workintech.zoo.exceptions;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;

public class ZooException extends RuntimeException {
    private HttpStatus status;
    public ZooException(String message, HttpStatus status){
        super(message);
        this.status=status;
    }

    public HttpStatus getHttpStatus() {
        return status;
    }

    public void setHttpStatus(HttpStatus status) {
        this.status = status;
    }
}