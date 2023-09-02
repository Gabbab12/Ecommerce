package dev.PodB.Ecommerce.Exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RuntimeException {
    private String message;
    private String status;

    public BadRequestException(String message, HttpStatus status) {
        this.message = message;
        this.status = String.valueOf(status);
    }

}
