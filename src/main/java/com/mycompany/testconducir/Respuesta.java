/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testconducir;

/**
 *
 * @author rober
 */
public class Respuesta {
    private boolean verdadero;
    String textoRespuesta;

    public Respuesta(String textoRespuesta, boolean verdadero) {
        this.verdadero = verdadero;
        this.textoRespuesta = textoRespuesta;
    }

    public boolean isVerdadero() {
        return verdadero;
    }

    public void setVerdadero(boolean verdadero) {
        this.verdadero = verdadero;
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }
    
}
