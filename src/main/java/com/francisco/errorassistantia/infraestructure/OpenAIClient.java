package com.francisco.errorassistantia.infraestructure;

import com.francisco.errorassistantia.infraestructure.config.ClientConfigError;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class OpenAIClient {
   private String apikey;

    public OpenAIClient(String apikey) {
        this.apikey = apikey;
    }

    public String enviarPrompt(String prompt) {
        //`GEMINI_API_KEY`.
        Client client = Client.builder().apiKey(apikey).build();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        prompt,
                        null);

        return response.text();
    }


    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
}
