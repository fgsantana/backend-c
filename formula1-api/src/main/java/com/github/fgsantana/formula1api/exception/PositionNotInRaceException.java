package com.github.fgsantana.formula1api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PositionNotInRaceException extends RuntimeException {
    public PositionNotInRaceException(int position) {
        super("The position " + position + " is not in this race!");
    }

}
