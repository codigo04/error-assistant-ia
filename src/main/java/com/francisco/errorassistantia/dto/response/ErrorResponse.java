package com.francisco.errorassistantia.dto.response;

import java.util.List;

public class ErrorResponse {
    private Exception mensajeOriginal;
    private String descripcion;
    private List<String> posiblesCausas;
    private List<String> sugerencias;


    public ErrorResponse(Exception mensajeOriginal, String descripcion, List<String> posiblesCausas, List<String> sugerencias) {
        this.mensajeOriginal = mensajeOriginal;
        this.descripcion = descripcion;
        this.posiblesCausas = posiblesCausas;
        this.sugerencias = sugerencias;
    }


    public Exception getMensajeOriginal() {
        return mensajeOriginal;
    }

    public void setMensajeOriginal(Exception mensajeOriginal) {
        this.mensajeOriginal = mensajeOriginal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getPosiblesCausas() {
        return posiblesCausas;
    }

    public void setPosiblesCausas(List<String> posiblesCausas) {
        this.posiblesCausas = posiblesCausas;
    }

    public List<String> getSugerencias() {
        return sugerencias;
    }

    public void setSugerencias(List<String> sugerencias) {
        this.sugerencias = sugerencias;
    }
}
