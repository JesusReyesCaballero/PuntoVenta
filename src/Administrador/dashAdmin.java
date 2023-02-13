package Administrador;

import java.sql.*;
import javax.swing.JOptionPane;
import Funciones.Conexion;
import java.awt.Color;
import puntoventa.Login;
public class dashAdmin extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection con = cc.getCon();
    
    public dashAdmin(int idUsuario) {
        initComponents();
        cerrar();
        this.setLocationRelativeTo(null);
        Color color = new Color(104, 123, 138);
        this.getContentPane().setBackground(color);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        String sql = "select * from Usuarios where idUsuario = '" + idUsuario + "'";
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                userLog.setText(rs.getString("Usuario"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage(), "SQL Exception", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private dashAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cerrar() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                confirmar();
            }
        });
    }

    public void confirmar() {
        if (JOptionPane.showConfirmDialog(null, "¿Desea cerrar su sesión actual?", "Cerrar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        userLog = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard Administrador");
        setBackground(new java.awt.Color(39, 51, 90));

        jToolBar1.setRollover(true);
        jToolBar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Terminal:");
        jToolBar1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("000");
        jToolBar1.add(jLabel2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        userLog.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-perfilUsuario.png"))); // NOI18N
        userLog.setText("Usuario Logueado");
        jMenu1.add(userLog);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-logout.png"))); // NOI18N
        jMenuItem2.setText("Cerrar Sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-personal.png"))); // NOI18N
        jMenu10.setText("Personal");
        jMenu10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-empleados.png"))); // NOI18N
        jMenuItem20.setText("Registar Empleado");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-usuarios.png"))); // NOI18N
        jMenuItem21.setText("Registrar Usuario");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem21);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-puesto.png"))); // NOI18N
        jMenuItem24.setText("Cargos Laborales");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem24);

        jMenuBar1.add(jMenu10);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-almacen.png"))); // NOI18N
        jMenu2.setText("Almacen");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem1.setText("Productos");
        jMenu2.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem3.setText("Categorias");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-compras.png"))); // NOI18N
        jMenu3.setText("Compras");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem4.setText("Compras");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem5.setText("Proveedores");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-ventas.png"))); // NOI18N
        jMenu4.setText("Ventas");
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem6.setText("Ventas");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem7.setText("Clientes");
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-reportes.png"))); // NOI18N
        jMenu5.setText("Resportes");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem8.setText("Ventas Realizadas");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem9.setText("Compras Realizadas");
        jMenu5.add(jMenuItem9);

        jMenuItem15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem15.setText("Cancelaciones");
        jMenu5.add(jMenuItem15);

        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenu5.add(jSeparator1);

        jMenuItem18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem18.setText("Lista de Clientes");
        jMenu5.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem19.setText("Lista de Empleados");
        jMenu5.add(jMenuItem19);

        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenu5.add(jSeparator2);

        jMenuItem10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem10.setText("Historial de Accesos");
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-cancelaciones.png"))); // NOI18N
        jMenu7.setText("Cancelaciones");
        jMenu7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem13.setText("Cancelar Venta");
        jMenu7.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem14.setText("Cancelar Compra");
        jMenu7.add(jMenuItem14);

        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-configuraciones.png"))); // NOI18N
        jMenu6.setText("Configuración");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem22.setText("Cambiar Contraseña");
        jMenu6.add(jMenuItem22);

        jMenuItem23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem23.setText("Terminal");
        jMenu6.add(jMenuItem23);

        jSeparator3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenu6.add(jSeparator3);

        jMenuItem11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem11.setText("Servidor");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem12.setText("Base de Datos");
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-herramientas.png"))); // NOI18N
        jMenu8.setText("Herramientas");
        jMenu8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItem16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem16.setText("Calculadora");
        jMenu8.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem17.setText("Verificar Producto");
        jMenu8.add(jMenuItem17);

        jMenuBar1.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon-soporte.png"))); // NOI18N
        jMenu9.setText("Soporte");
        jMenu9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 454, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        confirmar();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        adminEmpleados.main(null);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        adminUsuarios.main(null);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        adminPuestos.main(null);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

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
            java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem userLog;
    // End of variables declaration//GEN-END:variables
}
