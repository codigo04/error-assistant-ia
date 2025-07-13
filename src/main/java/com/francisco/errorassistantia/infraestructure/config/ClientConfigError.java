package com.francisco.errorassistantia.infraestructure.config;

public class ClientConfigError implements AutoCloseable{
    private final String apiKey;

    private ClientConfigError(Builder builder) {
        this.apiKey = builder.apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    @Override
    public void close() throws Exception {

    }

    public static  class Builder {
        private String apiKey;

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public ClientConfigError build() {
            return new ClientConfigError(this);
        }
    }
}
