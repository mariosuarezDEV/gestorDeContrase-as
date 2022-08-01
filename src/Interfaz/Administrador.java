/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Logico.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.result.Row;

/**
 *
 * @author Mario Suárez
 */
public class Administrador extends javax.swing.JFrame {
    DefaultTableModel datosDB = new DefaultTableModel();
    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        setLocationRelativeTo(this);
        tabla();
        ConsultarDB();
        modelCMB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCuentas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBPlataforma = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPlataforma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSubir = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbPlataforma = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbUpdate = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNuevoCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNuevaClave = new javax.swing.JPasswordField();
        btnGuardarCambios = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnObtenerDB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Adminsitrador de Cuentas.");

        tbCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbCuentas);

        jLabel2.setText("Buscar plataforma.");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre de plataforma.");

        jLabel4.setText("Escribe tu correo.");

        jLabel5.setText("Escribe la contraseña.");

        btnSubir.setText("Guardar Datos");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSubir)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtCorreo)
                            .addComponent(jLabel5)))
                    .addComponent(txtClave))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Subir", jPanel2);

        jLabel6.setText("Selecciona la plataforma");

        cmbPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlataformaActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44))
                    .addComponent(cmbPlataforma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jLabel7.setText("Selecciona la plataforma");

        cmbUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Nuevo correo:");

        txtNuevoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoCorreoActionPerformed(evt);
            }
        });

        jLabel9.setText("Nueva clave:");

        txtNuevaClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaClaveActionPerformed(evt);
            }
        });

        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNuevoCorreo))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cmbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNuevaClave))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNuevaClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCambios)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar", jPanel4);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnObtenerDB.setText("Actualizar");
        btnObtenerDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnObtenerDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCerrar)
                    .addComponent(btnObtenerDB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String filtro = txtBPlataforma.getText();
        boolean led = false , conectarDB = false;
        int nDatos = datosDB.getRowCount();
        Conexion cx = new Conexion();
        String sql = "select * from plataformas where plataforma='"+filtro+"'";
        Statement st;
        ResultSet rs;
        String [] datosConsulta = new String[4];
        
        //verificar que hay una busqueda
        if (filtro.equals("")) {
            JOptionPane.showMessageDialog(null, "Parece que no has escrito una plataforma");
        } else {
            led = true;
            conectarDB= true;
        }
        //consultar a db
        if (conectarDB==true) {
            try {
                st = cx.conectar().createStatement();
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (0<=nDatos & led==true) {
                        for (int i = 0; i < nDatos; i++) {
                            datosDB.removeRow(0);
                        }
                    }
                    //motrar en tabla
                    st = cx.conectar().createStatement();
                    rs = st.executeQuery(sql);
                    try {
                        while (rs.next()) {
                            datosConsulta[0] = rs.getString(1); //id
                            datosConsulta[1] = rs.getString(2); //plataforma
                            datosConsulta[2] = rs.getString(3); //correo
                            datosConsulta[3] = rs.getString(4); //clave
                            datosDB.addRow(datosConsulta);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "No se pueden mostrar los datos");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron los datos");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se puede consultar a la Base de datos");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnObtenerDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerDBActionPerformed
        int nDatos = datosDB.getRowCount();
        if (0<=nDatos) {
            for (int i = 0; i < nDatos; i++) {
                datosDB.removeRow(0);
            }
        }
        String sql = "select * from plataformas";
        Conexion cx = new Conexion();
        Statement st;
        ResultSet rs;
        String [] txtConsultas = new String[4];

        try {
            st = cx.conectar().createStatement();
            rs = st.executeQuery(sql);
            try {
                while (rs.next()) {
                    txtConsultas[0] = rs.getString(1);//id
                    txtConsultas[1] = rs.getString(2);//id
                    txtConsultas[2] = rs.getString(3);//id
                    txtConsultas[3] = rs.getString(4);//id
                    datosDB.addRow(txtConsultas);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Imposible conectar a la base de datos");
        }
        cmbPlataforma.removeAllItems();
        cmbUpdate.removeAllItems();
        ResultSet rs2;
        String sql2 = "select plataforma from plataformas";
        try { //establecer conexion
            st = cx.conectar().createStatement();
            rs2 = st.executeQuery(sql2);
            try {
                while (rs2.next()) {
                    cmbPlataforma.addItem(rs2.getString(1));
                    cmbUpdate.addItem(rs2.getString(1));
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar al sistema");
        }
    }//GEN-LAST:event_btnObtenerDBActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        String plataforma = txtPlataforma.getText();
        String correo = txtCorreo.getText();
        String clave = new String(txtClave.getPassword());
        String sql = "insert into plataformas (plataforma,correo,clave) values ('"+plataforma+"' , '"+correo+"' , '"+clave+"')";
        Conexion cx = new Conexion();
        PreparedStatement ps;
        try {
            ps = cx.conectar().prepareStatement(sql);
            ps.executeUpdate();
            txtPlataforma.setText("");
            txtCorreo.setText("");
            txtClave.setText("");
            JOptionPane.showMessageDialog(null, "Se subieron los datos, actualiza tu tabla");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnSubirActionPerformed

    private void cmbPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlataformaActionPerformed
        
    }//GEN-LAST:event_cmbPlataformaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String filtro = (String)cmbPlataforma.getSelectedItem();
        Conexion cx = new Conexion();
        String sql = "delete from plataformas where plataforma='"+ filtro+"'";
        PreparedStatement ps;
        try {
            ps = cx.conectar().prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado la plataforma, actualiza tu tabla");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNuevoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoCorreoActionPerformed

    private void txtNuevaClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaClaveActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        //nuevos datos
        String nuevoCorreo =  txtNuevoCorreo.getText();
        String nuevaClave = new String(txtNuevaClave.getPassword());
        String plataforma = (String)cmbUpdate.getSelectedItem();
        Conexion cx = new Conexion();
        String sqlCorreo = "update plataformas set correo='"+nuevoCorreo+"' where plataforma='"+plataforma+"'";
        String sqlClave = "update plataformas set clave='"+nuevaClave+"' where plataforma='"+plataforma+"'";
        PreparedStatement ps;
        if (nuevoCorreo.equals("")) {
            //no se cambie el coreo
        } else {
            try { //conectar a la db
                ps = cx.conectar().prepareStatement(sqlCorreo); //cambiar a global
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se actualizo el correo, recarga tu tabla");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        if (nuevaClave.equals("")) {
            //no se cambia la clave
        } else {
            try { //conectar a la db
                ps = cx.conectar().prepareStatement(sqlClave); //cambiar a global
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se actualizo la clave, recarga tu tabla");
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_btnGuardarCambiosActionPerformed
    
    public void tabla(){
        datosDB.addColumn("ID");
        datosDB.addColumn("Plataforma");
        datosDB.addColumn("Correo");
        datosDB.addColumn("Contraseña");
        tbCuentas.setModel(datosDB);
    }
    public void ConsultarDB(){
        String sql = "select * from plataformas";
        Conexion cx = new Conexion();
        Statement st;
        ResultSet rs;
        String [] txtConsultas = new String[4];

        try {
            st = cx.conectar().createStatement();
            rs = st.executeQuery(sql);
            try {
                while (rs.next()) {
                    txtConsultas[0] = rs.getString(1);//id
                    txtConsultas[1] = rs.getString(2);//id
                    txtConsultas[2] = rs.getString(3);//id
                    txtConsultas[3] = rs.getString(4);//id
                    datosDB.addRow(txtConsultas);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Imposible conectar a la base de datos");
        }
    }
    public void modelCMB(){
        cmbPlataforma.removeAllItems();
        cmbUpdate.removeAllItems();
        Conexion cx = new Conexion();
        Statement st;
        ResultSet rs;
        String sql = "select plataforma from plataformas";
        try { //establecer conexion
            st = cx.conectar().createStatement();
            rs = st.executeQuery(sql);
            try {
                while (rs.next()) {
                    cmbPlataforma.addItem(rs.getString(1));
                    cmbUpdate.addItem(rs.getString(1));
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar al sistema");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnObtenerDB;
    private javax.swing.JButton btnSubir;
    private javax.swing.JComboBox<String> cmbPlataforma;
    private javax.swing.JComboBox<String> cmbUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbCuentas;
    private javax.swing.JTextField txtBPlataforma;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtNuevaClave;
    private javax.swing.JTextField txtNuevoCorreo;
    private javax.swing.JTextField txtPlataforma;
    // End of variables declaration//GEN-END:variables
}