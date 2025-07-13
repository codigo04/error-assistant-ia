package com.francisco.errorassistantia.handler;

import com.francisco.errorassistantia.dto.response.ErrorResponse;
import com.francisco.errorassistantia.service.IAErrorService;

public class ErrorCatcher {

    private final IAErrorService iaErrorService;

    public ErrorCatcher(IAErrorService iaErrorService) {
        this.iaErrorService = iaErrorService;
    }


    public ErrorResponse catchError(Exception e) {
        return iaErrorService.procesarError(e);
    }
}
