package com.mycompany.twit;

import java.awt.Color;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame {

    public Registrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);

        //Logo
        ImageIcon iconLogo = new ImageIcon("Logo3.png");
        Image imgLogo = iconLogo.getImage();
        Image imgScaleLogo = imgLogo.getScaledInstance(LabelLogo.getWidth(), LabelLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconLogo = new ImageIcon(imgScaleLogo);
        LabelLogo.setIcon(scaledIconLogo);

        //Continuar
        ImageIcon iconContinuar = new ImageIcon("Continuar.png");
        Image imgContinuar = iconContinuar.getImage();
        Image imgScaleContinuar = imgContinuar.getScaledInstance(btn_Continuar.getWidth(), btn_Continuar.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconContinuar = new ImageIcon(imgScaleContinuar);
        btn_Continuar.setIcon(scaledIconContinuar);

        //Cancelar
        ImageIcon iconCancelar = new ImageIcon("Cancelar.png");
        Image imgCancelar = iconCancelar.getImage();
        Image imgScaleCancelar = imgCancelar.getScaledInstance(btn_Cancelar.getWidth(), btn_Cancelar.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIconCancelar = new ImageIcon(imgScaleCancelar);
        btn_Cancelar.setIcon(scaledIconCancelar);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelLogo = new javax.swing.JLabel();
        btn_Cancelar = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldContraseña = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelCrearCuenta = new javax.swing.JLabel();
        btn_Continuar = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelLogo.setText("Logo");
        LabelLogo.setBounds(new java.awt.Rectangle(70, 50, 50, 50));
        LabelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelLogoMouseClicked(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CancelarMouseClicked(evt);
            }
        });

        jTextFieldNombre.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNombre.setText("Nombre");

        jTextFieldContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });

        jLabelContraseña.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelContraseña.setText("Contraseña");

        jLabelCrearCuenta.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabelCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCrearCuenta.setText("Crea Tu Cuenta");

        btn_Continuar.setText("Continuar");
        btn_Continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ContinuarMouseClicked(evt);
            }
        });

        jLabelGenero.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(204, 204, 204));
        jLabelGenero.setText("Género");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jComboBoxGenero.setToolTipText("Seleccione");
        jComboBoxGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });

        jLabelUsername.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(204, 204, 204));
        jLabelUsername.setText("Username");

        jTextFieldUsername.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabelEdad.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEdad.setText("Edad");

        jTextFieldEdad.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEdad.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });

        jTextFieldFecha.setEditable(false);
        jTextFieldFecha.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldFecha.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Fecha");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jComboBoxGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelLogoMouseClicked
        new Menu_Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelLogoMouseClicked

    private void btn_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelarMouseClicked
        new Menu_Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CancelarMouseClicked

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void btn_ContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ContinuarMouseClicked
        String nombre = jTextFieldNombre.getText();
        String usuario = jTextFieldUsername.getText().trim();
        String contraseña = jTextFieldContraseña.getText().trim();
        String fechas = jTextFieldFecha.getText();
        String edad = jTextFieldEdad.getText();
        int Edad = Integer.parseInt(jTextFieldEdad.getText());
        int gener = jComboBoxGenero.getSelectedIndex();
        String genero = jComboBoxGenero.getItemAt(gener);
        UsuarioInfo.verificar_cuenta(usuario);

        try {
            Edad = Integer.parseInt(jTextFieldEdad.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INGRESAR VALORES ENTEROS EN LA EDAD");
            return;
        }

        if (nombre.isEmpty() || usuario.isEmpty() || contraseña.isEmpty() || fechas.isEmpty() || edad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos solicitados");
        } else {
            if (UsuarioInfo.verificar_cuenta(usuario)) {
                JOptionPane.showMessageDialog(null, "el usuario ya esta en uso");
            } else if (Edad<18){
                JOptionPane.showMessageDialog(null, "Debes ser mayor de 18 años para registrarte");
                
            } else{
                UsuarioInfo cuenta = new UsuarioInfo(usuario, nombre, edad, fechas, contraseña, genero);

                UsuarioInfo.agregarCuenta(cuenta);
                user_actual.setUsuarioActual(cuenta);

                jTextFieldNombre.setText("");
                jTextFieldUsername.setText("");
                jTextFieldContraseña.setText("");
                jTextFieldFecha.setText("");
                jTextFieldEdad.setText("");
                JOptionPane.showMessageDialog(null, "\nBienvenido\nCuenta registrada exitosamente: " + "\n"
                        + "Nombre: " + nombre + "\n"
                        + "Usuario: " + usuario + "\n"
                        + "Fecha: " + fechas + "\n"
                        + "Edad: " + edad + "\n"
                        + "contra: " + contraseña
                        + "\nGénero: " + genero);

                Inicio menu = new Inicio();
                menu.setVisible(true);
                this.dispose();

            }
        }

    }//GEN-LAST:event_btn_ContinuarMouseClicked

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed

    }//GEN-LAST:event_jComboBoxGeneroActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        LocalDate fechaActual = LocalDate.now();
        String fecha = fechaActual.toString();
        jTextFieldFecha.setText(fecha);
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel btn_Cancelar;
    private javax.swing.JLabel btn_Continuar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCrearCuenta;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
