package cuentas_correo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class correos extends javax.swing.JFrame {

    //static Connection conectar;
    Statement m;
    //PreparedStatement QUERY;
    ResultSet resultado;
    String sql;
    conectar co = new conectar();
    Connection leer = co.conectar();
    DefaultTableModel DTconsulta = new DefaultTableModel();

    public correos() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/Email.png")).getImage());
        setTitle("CUENTAS DE CORREO");
        lbl_fecha.setText(fechactual());
        desactiva();
        limpia_txt();
        try {
            m = leer.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error del query", JOptionPane.ERROR_MESSAGE);
        }

        this.tabla_mostrar.setModel(DTconsulta);
        DTconsulta.setColumnIdentifiers(new Object[]{
            "ID",
            "NOMBRE COMPLETO",
            "CORREO",
            "CONTRASEÑA",
            "FECHA"
        });

        consulta();
    }

    public static String fechactual() {
        Date fecha = new Date();
        java.sql.Date date = new java.sql.Date(fecha.getTime());
        return date + "";
    }

    void desactiva() {
        txt_nombre.setEnabled(false);
        txt_apll_paterno.setEnabled(false);
        txt_apll_materno.setEnabled(false);
        txt_correo.setEnabled(false);
        txt_contraseña.setEnabled(false);
        btn_nueva.setEnabled(true);
        btn_guardar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_guardar.setText("GUARDAR");
    }

    void activa() {
        txt_nombre.setEnabled(true);
        txt_apll_paterno.setEnabled(true);
        txt_apll_materno.setEnabled(true);
        txt_correo.setEnabled(true);
        txt_contraseña.setEnabled(true);
        btn_nueva.setEnabled(false);
        btn_guardar.setEnabled(true);
        btn_cancelar.setEnabled(true);
    }

    void limpia_txt() {
        txt_nombre.setText(null);
        txt_apll_paterno.setText(null);
        txt_apll_materno.setText(null);
        txt_correo.setText(null);
        txt_contraseña.setText(null);
        txt_id.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_nueva = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_apll_paterno = new javax.swing.JTextField();
        txt_apll_materno = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_mostrar = new javax.swing.JTable();
        btm_mostrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txt_busca_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setExtendedState(6);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUENTAS DE CORREO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 0, 48), java.awt.Color.white)); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUEVA CUENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 0, 24), java.awt.Color.white)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE(S) ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 62, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CORREO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 222, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 275, -1, -1));
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 190, 35));
        jPanel2.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 190, 35));

        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 190, 35));

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 135, 53));

        btn_nueva.setBackground(new java.awt.Color(255, 255, 255));
        btn_nueva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_nueva.setText("NUEVA CUENTA");
        btn_nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 148, 53));

        btn_guardar.setBackground(new java.awt.Color(255, 255, 255));
        btn_guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 137, 53));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO PATERNO(opcional)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 115, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("APELLIDO MATERNO(opcional)");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 168, 324, -1));
        jPanel2.add(txt_apll_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 190, 35));
        jPanel2.add(txt_apll_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 190, 35));

        lbl_fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha.setText("FECHA");
        jPanel2.add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 315, 112, -1));

        tabla_mostrar.setBackground(new java.awt.Color(0, 51, 51));
        tabla_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        tabla_mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_mostrar.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tabla_mostrar);

        btm_mostrar.setBackground(new java.awt.Color(255, 255, 255));
        btm_mostrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btm_mostrar.setText("MOSTRAR TODAS LAS CUENTAS");
        btm_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_mostrarActionPerformed(evt);
            }
        });

        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INGRESA EL ID DE CUENTA PARA:");

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_busca_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busca_nombreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INGRESA UN NOMBRE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_busca_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(btm_mostrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btm_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_busca_nombre)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar)))))
        );

        jMenuBar1.setBackground(new java.awt.Color(58, 159, 171));

        jMenu1.setText("Archivo");

        jMenuCerrarSesion.setText("Cerrar Sesión ");
        jMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCerrarSesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        jMenuItem1.setText("Información");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaActionPerformed

        activa();
        limpia_txt();
    }//GEN-LAST:event_btn_nuevaActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if (btn_guardar.getText() == "GUARDAR") {
            if (txt_nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un nombre", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_nombre.requestFocus();
            } else if (txt_correo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un correo", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_correo.requestFocus();
            } else if (txt_contraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar una contraseña", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_contraseña.requestFocus();
            } else {
                insertar();
                limpia_txt();
                consulta();
                desactiva();

            }
        } else if (btn_guardar.getText() == "MODIFICAR") {
            if (txt_nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un nombre", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_nombre.requestFocus();
            } else if (txt_correo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un correo", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_correo.requestFocus();
            } else if (txt_contraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar una contraseña", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_contraseña.requestFocus();
            } else {
                modificar();
                consulta();
                desactiva();
            }
        } else if (btn_guardar.getText() == "ELIMINAR") {
            eliminar();
            consulta();
            desactiva();
        }


    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        desactiva();
        limpia_txt();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btm_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_mostrarActionPerformed

        consulta();
    }//GEN-LAST:event_btm_mostrarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

        if (!txt_id.getText().isEmpty()) {
            cargar_modificar();
            btn_guardar.setText("MODIFICAR");
            activa();
        } else {
            JOptionPane.showMessageDialog(this, "No se a selecionado\nningún ID", "Error de seleción", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed

        if (btn_guardar.getText() == "GUARDAR") {
            if (txt_nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un nombre", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_nombre.requestFocus();
            } else if (txt_correo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un correo", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_correo.requestFocus();
            } else if (txt_contraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar una contraseña", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_contraseña.requestFocus();
            } else {
                insertar();
                limpia_txt();
                consulta();
                desactiva();

            }
        } else if (btn_guardar.getText() == "MODIFICAR") {
            if (txt_nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un nombre", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_nombre.requestFocus();
            } else if (txt_correo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar un correo", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_correo.requestFocus();
            } else if (txt_contraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes ingresar una contraseña", "Campo vacio", JOptionPane.WARNING_MESSAGE);
                txt_contraseña.requestFocus();
            } else {
                modificar();
                consulta();
                desactiva();
            }

        }
    }//GEN-LAST:event_txt_contraseñaActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        if (txt_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se a seleccionado\nningún ID", "Error de seleción", JOptionPane.ERROR_MESSAGE);
        } else {
            cargar_eliminar();
            activa();
            btn_guardar.setText("ELIMINAR");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        if (!txt_busca_nombre.getText().isEmpty()) {
            consulta_nombre();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha introducido\nningun nombre", "Error en la busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_busca_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busca_nombreActionPerformed

        if (!txt_busca_nombre.getText().isEmpty()) {
            consulta_nombre();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha introducido\nningun nombre", "Error en la busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_busca_nombreActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed

        if (!txt_id.getText().isEmpty()) {
            cargar_modificar();
            btn_guardar.setText("MODIFICAR");
            activa();
        } else {
            JOptionPane.showMessageDialog(this, "No se a selecionado\nningún ID", "Error de seleción", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_idActionPerformed

    private void jMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCerrarSesionActionPerformed
        // TODO add your handling code here:
        login lo = new login();
        lo.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuCerrarSesionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Cuentas de Correos\nCreado por:\nJuan David Rodriguez Zendejas","Autor",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    String nombre, apll_paterno, apll_materno, correo, contraseña, fecha;

    void insertar() {
        try {

            nombre = txt_nombre.getText();
            apll_paterno = txt_apll_paterno.getText();
            apll_materno = txt_apll_materno.getText();
            correo = txt_correo.getText();
            contraseña = txt_contraseña.getText();
            fecha = lbl_fecha.getText();

            sql = "INSERT INTO cuentas (nombre,apll_paterno,apll_materno,correo,contraseña,fecha) VALUES ('" + nombre + "','" + apll_paterno + "','" + apll_materno + "','" + correo + "','" + contraseña + "','" + fecha + "')";
            m = leer.createStatement();
            m.execute(sql);
            //query.execute(sql);
            JOptionPane.showMessageDialog(this, "Los datos se han guardado con exito", "Inserción correcta", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Error de inserción", JOptionPane.ERROR_MESSAGE);
        }
    }
    String id = "";

    void cargar_modificar() {
        try {
            id = txt_id.getText();
            sql = "SELECT * FROM cuentas WHERE id_cuentas=" + id;
            m = leer.createStatement();
            resultado = m.executeQuery(sql);
            //resultado = query.executeQuery(sql);
            while (resultado.next()) {
                nombre = resultado.getString("nombre");
                apll_paterno = resultado.getString("apll_paterno");
                apll_materno = resultado.getString("apll_materno");
                correo = resultado.getString("correo");
                contraseña = resultado.getString("contraseña");
                fecha = resultado.getString("fecha");
            }
            txt_nombre.setText(nombre);
            txt_apll_paterno.setText(apll_paterno);
            txt_apll_materno.setText(apll_materno);
            txt_correo.setText(correo);
            txt_contraseña.setText(contraseña);
            lbl_fecha.setText(fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }
    }

    void modificar() {
        try {

            id = txt_id.getText();
            nombre = txt_nombre.getText();
            apll_paterno = txt_apll_paterno.getText();
            apll_materno = txt_apll_materno.getText();
            correo = txt_correo.getText();
            contraseña = txt_contraseña.getText();
            sql = "UPDATE cuentas SET nombre= '" + nombre + "',apll_paterno= '" + apll_paterno + "',apll_materno= '" + apll_materno + "',correo= '" + correo + "',contraseña= '" + contraseña + "' WHERE id_cuentas= " + id;
            m= leer.createStatement();
            m.execute(sql);
            //query.execute(sql);
            JOptionPane.showMessageDialog(this, "Los datos se modificaron exitosamente", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error en la actualización", JOptionPane.ERROR_MESSAGE);
        }
    }

    void cargar_eliminar() {
        try {
            id = txt_id.getText();
            sql = "SELECT * FROM cuentas WHERE id_cuentas= " + id;
            m = leer.createStatement();
            resultado = m.executeQuery(sql);
            //resultado = query.executeQuery(sql);
            while (resultado.next()) {
                nombre = resultado.getString("nombre");
                apll_paterno = resultado.getString("apll_paterno");
                apll_materno = resultado.getString("apll_materno");
                correo = resultado.getString("correo");
                contraseña = resultado.getString("contraseña");
                fecha = resultado.getString("fecha");
            }
            txt_nombre.setText(nombre);
            txt_apll_paterno.setText(apll_paterno);
            txt_apll_materno.setText(apll_materno);
            txt_correo.setText(correo);
            txt_contraseña.setText(contraseña);
            lbl_fecha.setText(fecha);
        } catch (Exception e) {

        }
    }

    void eliminar() {
        try {
            id = txt_id.getText();
            sql = "DELETE FROM cuentas WHERE id_cuentas =" + id;
            m = leer.createStatement();
            m.execute(sql);
            //query.execute(sql);
            JOptionPane.showMessageDialog(this, "La cuenta fue\neliminada satisfactoriamente", "Cuenta Eliminada", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al la eliminación", "Eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }

    void consulta() {
        try {
            while (DTconsulta.getRowCount() > 0) {
                DTconsulta.removeRow(0);
            }
            //El while de arriba pregunta si la tabla tiene datos, si hay, va a eliminar la información
            sql = "SELECT * FROM cuentas";
            m = leer.createStatement();
            resultado = m.executeQuery(sql);
            //resultado = query.executeQuery(sql);
            while (resultado.next()) {
                tabla_mostrar.setModel(DTconsulta);
                DTconsulta.addRow(new Object[]{
                    resultado.getString("id_cuentas"),
                    resultado.getString("nombre") + " "
                    + resultado.getString("apll_paterno") + " "
                    + resultado.getString("apll_materno"),
                    resultado.getString("correo"),
                    resultado.getString("contraseña"),
                    resultado.getString("fecha")
                });

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error en la consulta", JOptionPane.WARNING_MESSAGE);
        }

    }

    void consulta_nombre() {
        try {
            while (DTconsulta.getRowCount() > 0) {
                DTconsulta.removeRow(0);
            }
            //El while de arriba pregunta si la tabla tiene datos, si hay, va a eliminar la información
            sql = "SELECT * FROM cuentas WHERE nombre= " + "'" + txt_busca_nombre.getText() + "'";
            m = leer.createStatement();
            resultado = m.executeQuery(sql);
            //resultado = query.executeQuery(sql);
            while (resultado.next()) {
                tabla_mostrar.setModel(DTconsulta);
                DTconsulta.addRow(new Object[]{
                    resultado.getString("id_cuentas"),
                    resultado.getString("nombre") + " "
                    + resultado.getString("apll_paterno") + " "
                    + resultado.getString("apll_materno"),
                    resultado.getString("correo"),
                    resultado.getString("contraseña"),
                    resultado.getString("fecha")
                        
                });
                
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Error en la consulta", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String args[]) {
       

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new correos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_mostrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCerrarSesion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JTable tabla_mostrar;
    private javax.swing.JTextField txt_apll_materno;
    private javax.swing.JTextField txt_apll_paterno;
    private javax.swing.JTextField txt_busca_nombre;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
