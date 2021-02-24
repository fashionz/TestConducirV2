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

    int idPregunta;
    String textoPregunta;
    Respuesta respuestaUno;
    Respuesta respuestaDos;
    Respuesta respuestaTres;
    Respuesta respuestaCuatro;

    public Pregunta(int idPregunta, String textoPregunta, Respuesta respuestaUno, Respuesta respuestaDos, Respuesta respuestaTres, Respuesta respuestaCuatro) {
        this.textoPregunta = textoPregunta;
        this.respuestaUno = respuestaUno;
        this.respuestaDos = respuestaDos;
        this.respuestaTres = respuestaTres;
        this.respuestaCuatro = respuestaCuatro;
        this.idPregunta = idPregunta;
    }

    public String getTextoPregunta() {
        return textoPregunta;
    }

    public void setTextoPregunta(String textoPregunta) {
        this.textoPregunta = textoPregunta;
    }

    public Respuesta getRespuestaUno() {
        return respuestaUno;
    }

    public void setRespuestaUno(Respuesta respuestaUno) {
        this.respuestaUno = respuestaUno;
    }

    public Respuesta getRespuestaDos() {
        return respuestaDos;
    }

    public void setRespuestaDos(Respuesta respuestaDos) {
        this.respuestaDos = respuestaDos;
    }

    public Respuesta getRespuestaTres() {
        return respuestaTres;
    }

    public void setRespuestaTres(Respuesta respuestaTres) {
        this.respuestaTres = respuestaTres;
    }

    public Respuesta getRespuestaCuatro() {
        return respuestaCuatro;
    }

    public void setRespuestaCuatro(Respuesta respuestaCuatro) {
        this.respuestaCuatro = respuestaCuatro;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

}
