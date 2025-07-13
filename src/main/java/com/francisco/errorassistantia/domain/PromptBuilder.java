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

        return "Actúa como un asistente experto en Java. Analiza el siguiente error y responde de forma técnica, precisa y breve.\n"
                + "Formato requerido (máximo 5 líneas por punto, sin bloques de código, sin explicaciones largas, sin ejemplos).\n"
                + "1. Descripción breve del error.\n"
                + "2. Posibles causas (en viñetas).\n"
                + "3. Sugerencias rápidas en código para resolverlo (en viñetas).\n"
                + "4. Indica claramente en qué línea del código se originó el error.\n\n"
                + "Error: " + error + "\n"
                + "Ubicación: " + ubicacion;
    }



}
