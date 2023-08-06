/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital;

import static hospital.EliminarUser.contarFilas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public final class Mhabitaciones extends javax.swing.JFrame {

    String Pacientes[][] = new String[100][4];
    String ruta = "C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\Datos.txt";

    public Mhabitaciones() {

        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        mostrarMatriz(Pacientes);
    }

    public void mostrarMatriz(String Pacientes[][]) {
        Metodos m = new Metodos();
        DefaultTableModel model = (DefaultTableModel) TablaPacientes.getModel();
        m.DeArchivoAMatriz(Pacientes, ruta);

        model.setRowCount(100);
        model.setColumnCount(4);

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 4; j++) {
                TablaPacientes.setValueAt(Pacientes[i][j], i, j);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAddPaciente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        Panel = new javax.swing.JTextArea();
        TxtBuscador = new javax.swing.JTextField();
        BtnAddPaciente1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPacientes = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        BtnAddPaciente.setText("Agregar Paciente");
        BtnAddPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddPacienteMouseClicked(evt);
            }
        });
        BtnAddPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddPacienteActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pacientes");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        Panel.setEditable(false);
        Panel.setColumns(20);
        Panel.setRows(5);
        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 390, 80));

        TxtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscadorActionPerformed(evt);
            }
        });
        jPanel1.add(TxtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        BtnAddPaciente1.setText("Agregar Paciente");
        BtnAddPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddPaciente1MouseClicked(evt);
            }
        });
        BtnAddPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddPaciente1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAddPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        TablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "ID", "Habitación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPacientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaPacientes);
        if (TablaPacientes.getColumnModel().getColumnCount() > 0) {
            TablaPacientes.getColumnModel().getColumn(0).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(1).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(2).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 660, 270));

        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refresh.png"))); // NOI18N
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 30, 30));

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png"))); // NOI18N
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 50, 30));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        Panel.setText("");

        boolean v = false;
        String IdB = TxtBuscador.getText();

        int n = contarFilas(ruta);

        String resultado = "";
        if (!TxtBuscador.getText().isEmpty()) {
            for (int i = 0; i < n; i++) {
                if (Pacientes[i][2].equals(IdB)) {
                    resultado += "Nombre: " + Pacientes[i][0] + "\n";
                    resultado += "Apellido: " + Pacientes[i][1] + "\n";
                    resultado += "Identificación: " + Pacientes[i][2] + "\n";
                    resultado += "Código de Habitación: " + Pacientes[i][3] + "\n";
                    v = false;
                    Panel.append(resultado);
                    break;
                } else {
                    v = true;
                }
            }

            if (v) {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        }

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TxtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscadorActionPerformed

    }//GEN-LAST:event_TxtBuscadorActionPerformed

    private void BtnAddPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddPacienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddPacienteMouseClicked

    private void BtnAddPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddPacienteActionPerformed

    }//GEN-LAST:event_BtnAddPacienteActionPerformed

    private void BtnAddPaciente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddPaciente1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddPaciente1MouseClicked

    private void BtnAddPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddPaciente1ActionPerformed
        AddPaciente agg = new AddPaciente();

        agg.setVisible(true);

    }//GEN-LAST:event_BtnAddPaciente1ActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed

        AddPaciente ap = new AddPaciente();

        mostrarMatriz(Pacientes);

    }//GEN-LAST:event_RefreshActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        VPrinc vp = new VPrinc();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Mhabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mhabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mhabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mhabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mhabitaciones().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton BtnAddPaciente;
    private javax.swing.JButton BtnAddPaciente1;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JLabel Fondo;
    public javax.swing.JTextArea Panel;
    private javax.swing.JButton Refresh;
    private javax.swing.JTable TablaPacientes;
    private javax.swing.JTextField TxtBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
