package com.francisco.errorassistantia;

import com.francisco.errorassistantia.domain.PromptBuilder;
import com.francisco.errorassistantia.dto.response.ErrorResponse;
import com.francisco.errorassistantia.handler.ErrorCatcher;
import com.francisco.errorassistantia.infraestructure.OpenAIClient;
import com.francisco.errorassistantia.infraestructure.config.ClientConfigError;
import com.francisco.errorassistantia.service.IAErrorService;

public class ErrorAssistantIA {
    private  final ErrorCatcher catcher;
    private static ErrorAssistantIA instance;

    private ErrorAssistantIA(ClientConfigError  clientConfigError) {
        OpenAIClient client = new OpenAIClient(clientConfigError.getApiKey());
        PromptBuilder builder = new PromptBuilder();
        IAErrorService service = new IAErrorService(builder, client);
        this.catcher = new ErrorCatcher(service);
    }

    public static void withConfig(ClientConfigError clientConfigError){
        if (instance == null) {
            instance = new ErrorAssistantIA(clientConfigError);
        } else {
            throw new IllegalStateException("ErrorAssistantIA ya fue configurado.");
        }
    }

    // analizar errores desde cualquier parte
    public static ErrorResponse analizaError(Exception ex) {
        if (instance == null) {
            throw new IllegalStateException("Debes configurar ErrorAssistantIA primero con withConfig()");
        }
        return instance.catcher.catchError(ex);
    }
}
