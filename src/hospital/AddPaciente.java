/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital;

import java.awt.Component;
import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Casa
 */
public class AddPaciente extends javax.swing.JFrame {

    int nR = 0;

    public int getnR() {
        return nR;
    }

    Metodos registro[] = new Metodos[100];

    File archivo = new File("C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\Datos.txt");
    String ruta = "C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\Datos.txt";

    public AddPaciente() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserIcon = new javax.swing.JLabel();
        txtAp = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtHab = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnAcp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar pacientes");

        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medico (1).png"))); // NOI18N
        jPanel1.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, -1));

        txtAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApActionPerformed(evt);
            }
        });
        txtAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApKeyTyped(evt);
            }
        });
        jPanel1.add(txtAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 150, -1));

        txtHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabActionPerformed(evt);
            }
        });
        txtHab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHabKeyTyped(evt);
            }
        });
        jPanel1.add(txtHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 150, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 20, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Habitación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        BtnAcp.setText("Agregar");
        BtnAcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcpActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Ingrese los siguientes datos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

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

    private void BtnAcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAcpActionPerformed
        verifCampos();
    }//GEN-LAST:event_BtnAcpActionPerformed

    private void txtApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabActionPerformed

    }//GEN-LAST:event_txtHabActionPerformed

    private void txtHabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHabKeyTyped

        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtHab.getText().trim().length() == 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHabKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtID.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtApKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        if (txtAp.getText().length() == 15) {
            evt.consume();
        }
        if (!(minusculas || mayusculas)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        if (txtName.getText().length() == 15) {
            evt.consume();
        }
        if (!(minusculas || mayusculas)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

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
            java.util.logging.Logger.getLogger(AddPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPaciente().setVisible(true);
            }
        });
    }

    public void registrar() {
        Mhabitaciones mh = new Mhabitaciones();
        String nom, id, apellido, hab;
        try {

            if (!archivo.exists()) {
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "Se ha creado el archivo");
            }
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));

            nom = txtName.getText();
            id = txtID.getText();
            apellido = txtAp.getText();
            hab = txtHab.getText();

            String me = nom + ";" + apellido + ";" + id + ";" + hab + ";";

            Fescribe.write(me + "\r\n");
            System.out.println("Registro realizado");
            txtName.setText("");
            txtAp.setText("");
            txtID.setText("");
            txtHab.setText("");

            Fescribe.close();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void verifCampos() {
        Temporal tm = new Temporal();
        Metodos m = new Metodos();

        String nombre, apellido;
        String id, hab;

        if (txtName.getText().equals("") || txtAp.getText().equals("") || txtID.getText().equals("") || txtHab.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Le falta rellenar espacios");
        } else {
            if (txtHab.getText().length() == 1 || txtHab.getText().length() == 2) {
                JOptionPane.showMessageDialog(null, "Ingrese un número entre 001 y 100");
            } else {
                if (Integer.parseInt(txtHab.getText()) <= 100 && Integer.parseInt(txtHab.getText()) > 0) {

                    if (!m.verificarID(txtID.getText(), ruta) && !m.verificarHab(txtHab.getText(), ruta)) {
                        nombre = txtName.getText().trim();
                        apellido = txtAp.getText().trim();
                        id = txtID.getText().trim();
                        hab = txtHab.getText().trim();

                        m.Agregar(registro, nombre, apellido, id, hab, nR);

                        nR++;

                        registrar();

                        JOptionPane.showMessageDialog(null, "Registro Exitoso");

                        txtName.setText("");
                        txtAp.setText("");
                        txtID.setText("");
                        txtHab.setText("");

                        this.dispose();
                    } else {
                        if (m.verificarID(txtID.getText(), ruta)) {
                            JOptionPane.showMessageDialog(null, "El numero de identificación ya se encuentra registrado\n\n\tPor favor ingrese otro");
                            txtID.setText("");

                        }
                        if (m.verificarUser(txtHab.getText(), ruta)) {
                            JOptionPane.showMessageDialog(null, "La habitación ya se encuentra en uso\n\n\tPor favor ingrese otro");
                            txtHab.setText("");
                        }
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcp;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAp;
    private javax.swing.JTextField txtHab;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void setText(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
