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
public class FrameResultados extends javax.swing.JFrame {
    int aciertos;

    public FrameResultados(int aciertos) {
        this.aciertos = aciertos;
        initComponents();
        setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        labelTituloFinal = new javax.swing.JLabel();
        botonMenuPrincipal = new javax.swing.JButton();
        labelResultadoExamen1 = new javax.swing.JLabel();
        labelAciertos1 = new javax.swing.JLabel();
        version1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloFinal.setFont(new java.awt.Font("Century Gothic", 1, 52)); // NOI18N
        labelTituloFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloFinal.setText("¡HAS FINALIZADO!");

        botonMenuPrincipal.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        botonMenuPrincipal.setText("Menú Principal");
        botonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuPrincipalActionPerformed(evt);
            }
        });

        labelResultadoExamen1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelResultadoExamen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResultadoExamen1.setText("jLabel1");

        labelAciertos1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelAciertos1.setText("jLabel1");

        version1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        version1.setText("Gracias por realizar mi test, hasta pronto.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTituloFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAciertos1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelResultadoExamen1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(version1)
                        .addGap(170, 170, 170))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTituloFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelResultadoExamen1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelAciertos1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(version1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMenuPrincipalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenuPrincipal;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAciertos1;
    private javax.swing.JLabel labelResultadoExamen1;
    private javax.swing.JLabel labelTituloFinal;
    private javax.swing.JLabel version1;
    // End of variables declaration//GEN-END:variables
}
