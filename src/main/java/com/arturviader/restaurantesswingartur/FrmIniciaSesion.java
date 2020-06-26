/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arturviader.restaurantesswingartur;

import com.arturviader.restaurantesswingartur.Data.Memoria;
import javax.swing.JOptionPane;

/**
 * Ventana iniciar sesión
 * @author alu2017363
 */
public class FrmIniciaSesion extends javax.swing.JDialog {
    Memoria memoria = Memoria.getInstance();
    /**
     * Creates new form FrmIniciaSesion
     */
    public FrmIniciaSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lIncorrecto.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tPassword = new javax.swing.JPasswordField();
        bValidar = new javax.swing.JButton();
        tUsuario = new javax.swing.JTextField();
        lIncorrecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Usuario");

        jLabel2.setText("Password");

        bValidar.setText("Validar");
        bValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValidarActionPerformed(evt);
            }
        });

        lIncorrecto.setForeground(new java.awt.Color(255, 51, 51));
        lIncorrecto.setText("Login incorrecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tUsuario)
                            .addComponent(tPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lIncorrecto)
                        .addGap(71, 71, 71)
                        .addComponent(bValidar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bValidar)
                    .addComponent(lIncorrecto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón validar
     * @param evt 
     */
    private void bValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValidarActionPerformed
        if (!tUsuario.getText().isEmpty() && !tPassword.getText().isEmpty())
        {
            if (memoria.login(tUsuario.getText(), tPassword.getText()))
            {
                memoria.createUserFolderIfNotExists();
                FrmMenu frmmenu = new FrmMenu();
                frmmenu.setVisible(true);
                
                this.dispose();
            }
            else
            {
                lIncorrecto.setVisible(true);
            }   
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Debes rellenar todos los campos.", "cuidado", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_bValidarActionPerformed

    
    
    
    /*Desarrollos pendientes
        Mostrar algo en las excepciones.
        Poner campos login en rojo
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lIncorrecto;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
}