/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testconducir;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JRootPane;

/**
 *
 * @author rober
 */
public class FramePreguntas extends javax.swing.JFrame {

    private ArrayList<Pregunta> listapreguntas;
    private ConexionBD bd;
    private int numeroPregunta;
    private Respuesta[] respuestasAcertadasONo; //este array guarda la respuesta que se selecciona de una pregunta
    

    /**
     * Creates new form FramePreguntas
     */
    public FramePreguntas(ConexionBD bd) {
        listapreguntas = bd.getPreguntasYRespuestas();
        numeroPregunta = 0;
        
        setResizable(false);
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        initComponents();
        setVisible(true);
        //Randomiza las preguntas
        Collections.shuffle(listapreguntas);
        respuestasAcertadasONo = new Respuesta[listapreguntas.size()];
        escribirPyR();
    }

    public void escribirPyR() {
        buttonGroup1.clearSelection();
        Pregunta preg = listapreguntas.get(numeroPregunta);
        labelNumPreg.setText(String.valueOf(numeroPregunta + 1));
        labelPregunta.setText("<html>" + preg.getTextoPregunta() + "</html>");
        respuestaUno.setText("<html>" + preg.getRespuestaUno().getTextoRespuesta() + "</html>");
        respuestaDos.setText("<html>" + preg.getRespuestaDos().getTextoRespuesta() + "</html>");
        respuestaTres.setText("<html>" + preg.getRespuestaTres().getTextoRespuesta() + "</html>");
        respuestaCuatro.setText("<html>" + preg.getRespuestaCuatro().getTextoRespuesta() + "</html>");
        //Comprueba que una respuesta sea marcada. Si no es null, ergo una está marcada, comprueba si es la 1, 2, 3 o 4 y la marca.
        if(respuestasAcertadasONo[numeroPregunta] != null) { 
            Respuesta respuesta = respuestasAcertadasONo[numeroPregunta]; //Coge la pregunta actual.
            if(respuestaUno.getText().equals("<html>" + respuesta.getTextoRespuesta() + "</html>")){
                respuestaUno.setSelected(true);
            }
            else if(respuestaDos.getText().equals("<html>" + respuesta.getTextoRespuesta() + "</html>")) {
                respuestaDos.setSelected(true);
            }
            else if(respuestaTres.getText().equals("<html>" + respuesta.getTextoRespuesta() + "</html>")) {
                respuestaTres.setSelected(true);
            }
            else if(respuestaCuatro.getText().equals("<html>" + respuesta.getTextoRespuesta() + "</html>")) {
                respuestaCuatro.setSelected(true);
            }
        }
        if (numeroPregunta + 1 == listapreguntas.size()) {
            botonSiguiente.setText("Finalizar");
        }
        else{
            botonSiguiente.setText("Siguiente");
        }
    }

//    public void escribirPyR() {
//        String[] preg = listapreguntas.get(numeroPregunta);
//        labelPregunta.setText(preg[1]);
//        System.out.println(preg[0]);
//        ArrayList<String[]> listarespuestas = bd.getRespuestas(Integer.parseInt(preg[0]));
//        Collections.shuffle(listarespuestas);
//        respuestaUno.setText(listarespuestas.get(0)[1]);
//        respuestaDos.setText(listarespuestas.get(0)[2]);
//        respuestaTres.setText(listarespuestas.get(0)[3]);
//        respuestaCuatro.setText(listarespuestas.get(0)[4]);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        labelNumPreg = new javax.swing.JLabel();
        labelPregunta = new javax.swing.JLabel();
        respuestaUno = new javax.swing.JRadioButton();
        respuestaDos = new javax.swing.JRadioButton();
        respuestaTres = new javax.swing.JRadioButton();
        respuestaCuatro = new javax.swing.JRadioButton();
        botonSiguiente = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        version1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("PREGUNTAS");

        labelNumPreg.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        labelNumPreg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelPregunta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelPregunta.setText("jLabel3");

        respuestaUno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respuestaUno.setText("jRadioButton1");
        respuestaUno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respuestaUnoStateChanged(evt);
            }
        });

        respuestaDos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respuestaDos.setText("jRadioButton1");
        respuestaDos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respuestaDosStateChanged(evt);
            }
        });

        respuestaTres.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respuestaTres.setText("jRadioButton1");
        respuestaTres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respuestaTresStateChanged(evt);
            }
        });
        respuestaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaTresActionPerformed(evt);
            }
        });

        respuestaCuatro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respuestaCuatro.setText("jRadioButton1");
        respuestaCuatro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respuestaCuatroStateChanged(evt);
            }
        });

        botonSiguiente.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonAnterior.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonAnterior.setText("Anterior");
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });

        version1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        version1.setText("Test realizado por la Universidad de la Vida.");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNumPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(respuestaDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(respuestaTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(respuestaCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(respuestaUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(version1)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNumPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuestaUno)
                .addGap(18, 18, 18)
                .addComponent(respuestaDos)
                .addGap(18, 18, 18)
                .addComponent(respuestaTres)
                .addGap(18, 18, 18)
                .addComponent(respuestaCuatro)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(version1)
                .addContainerGap())
        );

        buttonGroup1.add(respuestaUno);
        buttonGroup1.add(respuestaDos);
        buttonGroup1.add(respuestaTres);
        buttonGroup1.add(respuestaCuatro);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void respuestaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaTresActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        if (!botonSiguiente.getText().equals("Finalizar")) {
            numeroPregunta++;
            escribirPyR();
        }
        else{
            int aciertos = 0;
            for(Respuesta resp : respuestasAcertadasONo){
                if(resp != null) {
                    if(resp.isVerdadero()) {
                        aciertos++;
                    }
                }
            } 
            new FrameResultados(aciertos);
        }
        
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
        if(numeroPregunta > 0){
            numeroPregunta--;
            escribirPyR();
        }
    }//GEN-LAST:event_botonAnteriorActionPerformed

    private void respuestaUnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respuestaUnoStateChanged
        if(respuestaUno.isSelected()){
            Pregunta pregunta = listapreguntas.get(numeroPregunta);//esto me da la pregunta que equivale a este número
            respuestasAcertadasONo[numeroPregunta] = pregunta.respuestaUno; //selecciona la respuesta uno de cada pregunta.
        }
    }//GEN-LAST:event_respuestaUnoStateChanged

    private void respuestaDosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respuestaDosStateChanged
        if(respuestaDos.isSelected()){
            Pregunta pregunta = listapreguntas.get(numeroPregunta);//esto me da la pregunta que equivale a este número
            respuestasAcertadasONo[numeroPregunta] = pregunta.respuestaDos; //selecciona la respuesta dos de cada pregunta.
        }
    }//GEN-LAST:event_respuestaDosStateChanged

    private void respuestaTresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respuestaTresStateChanged
        if(respuestaTres.isSelected()){
            Pregunta pregunta = listapreguntas.get(numeroPregunta);//esto me da la pregunta que equivale a este número
            respuestasAcertadasONo[numeroPregunta] = pregunta.respuestaTres; //selecciona la respuesta tres de cada pregunta.
        }
    }//GEN-LAST:event_respuestaTresStateChanged

    private void respuestaCuatroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respuestaCuatroStateChanged
        if(respuestaCuatro.isSelected()){
            Pregunta pregunta = listapreguntas.get(numeroPregunta);//esto me da la pregunta que equivale a este número
            respuestasAcertadasONo[numeroPregunta] = pregunta.respuestaCuatro; //selecciona la respuesta cuatro de cada pregunta.
        }
    }//GEN-LAST:event_respuestaCuatroStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelNumPreg;
    private javax.swing.JLabel labelPregunta;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton respuestaCuatro;
    private javax.swing.JRadioButton respuestaDos;
    private javax.swing.JRadioButton respuestaTres;
    private javax.swing.JRadioButton respuestaUno;
    private javax.swing.JLabel version1;
    // End of variables declaration//GEN-END:variables
}
