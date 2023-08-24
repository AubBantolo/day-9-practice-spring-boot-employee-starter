package com.afs.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeIsInactiveException extends RuntimeException {

    public EmployeeIsInactiveException() {
        super("Employee is inactive");
    }
}
