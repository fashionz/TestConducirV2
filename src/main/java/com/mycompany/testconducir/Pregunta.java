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
public class Pregunta {
    String textoPregunta;
    String respuestaVerdadera;
    String respuestaDos;
    String respuestaTres;
    String respuestaCuatro;
    int idPregunta;

    public Pregunta(int idPregunta, String textoPregunta, String respuestaVerdadera, String respuestaDos, String respuestaTres, String respuestaCuatro) {
        this.idPregunta = idPregunta;
        this.textoPregunta = textoPregunta;
        this.respuestaVerdadera = respuestaVerdadera;
        this.respuestaDos = respuestaDos;
        this.respuestaTres = respuestaTres;
        this.respuestaCuatro = respuestaCuatro;
    }

    public String getTextoPregunta() {
        return textoPregunta;
    }

    public void setTextoPregunta(String textoPregunta) {
        this.textoPregunta = textoPregunta;
    }

    public String getRespuestaVerdadera() {
        return respuestaVerdadera;
    }

    public void setRespuestaVerdadera(String respuestaVerdadera) {
        this.respuestaVerdadera = respuestaVerdadera;
    }

    public String getRespuestaDos() {
        return respuestaDos;
    }

    public void setRespuestaDos(String respuestaDos) {
        this.respuestaDos = respuestaDos;
    }

    public String getRespuestaTres() {
        return respuestaTres;
    }

    public void setRespuestaTres(String respuestaTres) {
        this.respuestaTres = respuestaTres;
    }

    public String getRespuestaCuatro() {
        return respuestaCuatro;
    }

    public void setRespuestaCuatro(String respuestaCuatro) {
        this.respuestaCuatro = respuestaCuatro;
    }
    
    
    
    
    
}
