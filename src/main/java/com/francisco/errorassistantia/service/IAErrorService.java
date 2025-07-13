package com.francisco.errorassistantia.service;

import com.francisco.errorassistantia.domain.PromptBuilder;
import com.francisco.errorassistantia.dto.response.ErrorResponse;
import com.francisco.errorassistantia.infraestructure.OpenAIClient;

public class IAErrorService {

     final PromptBuilder promptBuilder;
     final OpenAIClient openAIClient;

    public IAErrorService(PromptBuilder promptBuilder, OpenAIClient openAIClient) {
        this.promptBuilder = promptBuilder;
        this.openAIClient = openAIClient;
    }


    public ErrorResponse procesarError(Exception error) {
        String prompt = promptBuilder.construirPrompt(error);
        String respuestaIA = openAIClient.enviarPrompt(prompt);
        return new ErrorResponse(error, respuestaIA, null, null);
    }
}
