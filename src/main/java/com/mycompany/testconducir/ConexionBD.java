/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testconducir;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rober
 */
public class ConexionBD {

    private Connection connection;
    private Statement statement;

    public ConexionBD(File dbFile) {
        String filePath = dbFile.getPath();
        conexionBaseDatos(filePath);
    }

    private void conexionBaseDatos(String dbPath) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Método que guarda las preguntas en un Array de Strings con sus dos campos (ID y TextoPreguntas)
    public ArrayList<String[]> getPreguntas() {
        ArrayList<String[]> listaPreguntas = new ArrayList<>();
        try {
            ResultSet rsTest = statement.executeQuery("SELECT * FROM tablapreguntas");
            while (rsTest.next()) {
                String preguntas[] = {String.valueOf(rsTest.getObject(1)), String.valueOf(rsTest.getObject(2))};
                listaPreguntas.add(preguntas);
            }
            rsTest.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPreguntas;
    }

    //Método que guarda las respuestas en un Array de Strings con sus seis campos (ID, Pregunta Correcta, 2º-3º-4º Preguntas <Erroneas> y la ID Foranea)
    public ArrayList<String[]> getRespuestas(int idresppreg) {
        ArrayList<String[]> listaRespuestas = new ArrayList<>();
        try {
            ResultSet rsTest = statement.executeQuery("SELECT * FROM tablarespuestas WHERE id_resp_preg= " + idresppreg);
            while (rsTest.next()) {
                String respuestas[] = {String.valueOf(rsTest.getObject(1)), String.valueOf(rsTest.getObject(2)), String.valueOf(rsTest.getObject(3)), String.valueOf(rsTest.getObject(4)), String.valueOf(rsTest.getObject(5)), String.valueOf(rsTest.getObject(6))};
                listaRespuestas.add(respuestas);
            }
            rsTest.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRespuestas;
    }

    //Método que guarda las respuestas y te dice cuantos aciertos has tenido en el test.
    //También te dirá en base a las preguntas y aciertos, si has suspendido y no.
}
