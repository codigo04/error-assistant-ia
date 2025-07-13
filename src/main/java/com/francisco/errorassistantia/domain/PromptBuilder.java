package com.francisco.errorassistantia.domain;

public class PromptBuilder {

    public String construirPrompt(Exception exception) {
        String error = exception.toString(); // Tipo + mensaje

        StackTraceElement origen = exception.getStackTrace()[0];
        String clase = origen.getClassName();
        String metodo = origen.getMethodName();
        String archivo = origen.getFileName();
        int linea = origen.getLineNumber();

        String ubicacion = "Clase: " + clase + ", Método: " + metodo + ", Archivo: " + archivo + ", Línea: " + linea;

        return """
        Actúa como un asistente experto en Java. Analiza el siguiente error y responde de forma técnica, precisa y breve.
        Formato requerido (máximo 5 líneas por punto, sin bloques de código, sin explicaciones largas, sin ejemplos).
        1. Descripción breve del error.
        2. Posibles causas (en viñetas).
        3. Sugerencias rapidas en codigo para resolverlo (en viñetas).
        4. Indica claramente en qué línea del código se originó el error.
        
        Error: %s
        Ubicación: %s
        """.formatted(error, ubicacion);
    }



}
