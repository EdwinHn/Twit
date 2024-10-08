package com.mycompany.twit;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InternalEntrarPerfil extends javax.swing.JInternalFrame {

    String nombre;
    String usuario;
    String genero;
    String edad;
    String fecha;

    private ArrayList<String> twits;

    private UsuarioInfo verTwits;

    public InternalEntrarPerfil() {

        initComponents();
        this.twits = new ArrayList<>();
    }

    Gestion_Cuenta gestionCuentas = new Gestion_Cuenta();

    public void actualizarInterfaz() {
        UsuarioInfo usuarioLogueado = user_actual.getUsuarioActual();
        String perfil = jTextFieldBuscarPerfil.getText();
        UsuarioInfo cuentaInfo = gestionCuentas.obtenerInformacion(perfil);

        if (usuarioLogueado != null && cuentaInfo != null) {
            jLabelSiguiendo.setText("" + usuarioLogueado.getSeguidos().cantidadSeguidos());
            jLabelSeguidores.setText("" + cuentaInfo.getSeguidores());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldBuscarPerfil = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
        jLabelInstrucción = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelGénero1 = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelGénero = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelGeneroUsuario = new javax.swing.JLabel();
        btn_Seguir = new javax.swing.JLabel();
        jLabelFechaUsuario = new javax.swing.JLabel();
        jLabelEdadUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTwits = new javax.swing.JTextArea();
        btn_Unfollow = new javax.swing.JButton();
        jLabelSeguidores = new javax.swing.JLabel();
        jLabelGénero2 = new javax.swing.JLabel();
        jLabelSiguiendo = new javax.swing.JLabel();
        jLabelGénero3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);

        jTextFieldBuscarPerfil.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldBuscarPerfil.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextFieldBuscarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscarPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextFieldBuscarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarPerfilActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabelInstrucción.setText("Ingresa el usuario que desea buscar:");

        jLabelFoto.setText("Foto");

        jLabelGénero1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGénero1.setText("Se unió:");

        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));

        jLabelNombre.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));

        jLabelGénero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGénero.setText("Género:");

        jLabelEdad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEdad.setText("Edad:");

        jLabelGeneroUsuario.setForeground(new java.awt.Color(255, 255, 255));

        btn_Seguir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Seguir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Seguir.setText("Seguir");
        btn_Seguir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        btn_Seguir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Seguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SeguirMouseClicked(evt);
            }
        });

        jLabelFechaUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabelEdadUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jTextAreaTwits.setEditable(false);
        jTextAreaTwits.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaTwits.setColumns(20);
        jTextAreaTwits.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextAreaTwits.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaTwits.setLineWrap(true);
        jTextAreaTwits.setRows(5);
        jTextAreaTwits.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jScrollPane1.setViewportView(jTextAreaTwits);

        btn_Unfollow.setForeground(new java.awt.Color(255, 255, 255));
        btn_Unfollow.setText("Dejar de Seguir");
        btn_Unfollow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btn_Unfollow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Unfollow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UnfollowMouseClicked(evt);
            }
        });

        jLabelSeguidores.setForeground(new java.awt.Color(255, 255, 255));

        jLabelGénero2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGénero2.setText("Seguidores:");

        jLabelSiguiendo.setForeground(new java.awt.Color(255, 255, 255));

        jLabelGénero3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGénero3.setText("Siguiendo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInstrucción)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelGénero1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelFechaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(btn_Seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_Unfollow, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelGénero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelGeneroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelGénero2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelSeguidores, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelEdadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelGénero3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelSiguiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelInstrucción)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBuscarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSeguidores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGénero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSiguiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGénero3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelGénero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelGeneroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEdadUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelGénero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFechaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_Seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Unfollow, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String perfil = jTextFieldBuscarPerfil.getText();
        if (gestionCuentas.verificar(perfil)) {
            UsuarioInfo info = gestionCuentas.obtenerInformacion(perfil);
            if (info != null) {
                nombre = info.getnombre();
                usuario = info.getusuario();
                edad = info.getedad();
                genero = info.getgenero();
                fecha = info.getfecha();

                jLabelUsername.setText("@" + usuario);
                jLabelNombre.setText(nombre);
                jLabelEdadUsuario.setText(edad);
                jLabelFechaUsuario.setText(fecha);
                jLabelGeneroUsuario.setText(genero);

                jLabelSeguidores.setText("" + info.getSeguidores());
                jLabelSiguiendo.setText("" + info.getSeguidos().cantidadSeguidos());

                if (genero.equals("Masculino")) {
                    ImageIcon iconFoto = new ImageIcon("Hombre.png");
                    Image imgFoto = iconFoto.getImage();
                    Image imgScaleFoto = imgFoto.getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon scaledIconFoto = new ImageIcon(imgScaleFoto);
                    jLabelFoto.setIcon(scaledIconFoto);

                } else if (genero.equals("Femenino")) {
                    ImageIcon iconFoto = new ImageIcon("Mujer.png");
                    Image imgFoto = iconFoto.getImage();
                    Image imgScaleFoto = imgFoto.getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon scaledIconFoto = new ImageIcon(imgScaleFoto);
                    jLabelFoto.setIcon(scaledIconFoto);
                }

                verTwits = info; 


                StringBuilder sb = new StringBuilder();
                for (String twit : twits) {
                    sb.append(twit).append("\n");
                }

                
                jTextAreaTwits.setText(sb.toString());

            }

        } else {
            ImageIcon iconFoto = new ImageIcon("Nadie.png");
            Image imgFoto = iconFoto.getImage();
            Image imgScaleFoto = imgFoto.getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIconFoto = new ImageIcon(imgScaleFoto);
            jLabelFoto.setIcon(scaledIconFoto);

            jLabelNombre.setText("No hay resultados");
            jLabelUsername.setText("");
            jLabelEdadUsuario.setText("");
            jLabelFechaUsuario.setText("");
            jLabelGeneroUsuario.setText("");
            jLabelSeguidores.setText("");
            jLabelSiguiendo.setText("");

        }

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btn_SeguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SeguirMouseClicked
        String perfil = jTextFieldBuscarPerfil.getText();
        UsuarioInfo usuarioLogueado = user_actual.getUsuarioActual();
        UsuarioInfo cuentaASeguir = gestionCuentas.obtenerInformacion(perfil);

        if (cuentaASeguir != null && !perfil.equals(usuarioLogueado.getusuario())) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas seguir a " + cuentaASeguir.getusuario() + "?", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                usuarioLogueado.seguirUsuario(cuentaASeguir);
                JOptionPane.showMessageDialog(null, "Ahora sigues a " + cuentaASeguir.getusuario());
                actualizarInterfaz();
            }
        } else if (perfil.equals(usuarioLogueado.getusuario())) {
            JOptionPane.showMessageDialog(null, "No puedes seguirte a ti mismo.");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }
    }//GEN-LAST:event_btn_SeguirMouseClicked

    private void btn_UnfollowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UnfollowMouseClicked
        String perfil = jTextFieldBuscarPerfil.getText();
        UsuarioInfo usuarioLogueado = user_actual.getUsuarioActual();
        UsuarioInfo cuentaADejarDeSeguir = gestionCuentas.obtenerInformacion(perfil);

        if (cuentaADejarDeSeguir != null && !perfil.equals(usuarioLogueado.getusuario())) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas dejar de seguir a " + cuentaADejarDeSeguir.getusuario() + "?", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                usuarioLogueado.dejarDeSeguir(cuentaADejarDeSeguir);
                JOptionPane.showMessageDialog(null, "Has dejado de seguir a " + cuentaADejarDeSeguir.getusuario());
                actualizarInterfaz();
            }
        } else if (perfil.equals(usuarioLogueado.getusuario())) {
            JOptionPane.showMessageDialog(null, "No puedes dejar de seguirte a ti mismo.");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }
    }//GEN-LAST:event_btn_UnfollowMouseClicked

    private void jTextFieldBuscarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btn_Seguir;
    private javax.swing.JButton btn_Unfollow;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEdadUsuario;
    private javax.swing.JLabel jLabelFechaUsuario;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelGeneroUsuario;
    private javax.swing.JLabel jLabelGénero;
    private javax.swing.JLabel jLabelGénero1;
    private javax.swing.JLabel jLabelGénero2;
    private javax.swing.JLabel jLabelGénero3;
    private javax.swing.JLabel jLabelInstrucción;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSeguidores;
    private javax.swing.JLabel jLabelSiguiendo;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTwits;
    private javax.swing.JTextField jTextFieldBuscarPerfil;
    // End of variables declaration//GEN-END:variables
}
