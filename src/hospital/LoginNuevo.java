package hospital;

import static hospital.Registro.registros;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginNuevo extends javax.swing.JFrame {

    String ruta = "C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\usuarios.txt";
    String[][] User = new String[10][5];

    public LoginNuevo() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        ventana();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Icono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtuser = new javax.swing.JTextField();
        Tipo = new javax.swing.JComboBox<>();
        Iniciarsesion = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UserIcon.png"))); // NOI18N
        jPanel1.add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtpass.setText("Contraseña");
        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassFocusLost(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 120, -1));

        txtuser.setText("Nombre de usuario");
        txtuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtuserFocusLost(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuserKeyTyped(evt);
            }
        });
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 120, -1));

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de usuario", "Administrador", "Asistente" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, -1));

        Iniciarsesion.setText("Iniciar sesion");
        Iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarsesionActionPerformed
        Verif();
    }//GEN-LAST:event_IniciarsesionActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void txtpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusLost
        if (txtpass.getText().equals("")) {
            txtpass.setText("Contraseña");
        }
    }//GEN-LAST:event_txtpassFocusLost

    private void txtpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusGained
        if (txtpass.getText().equals("Contraseña")) {
            txtpass.setText("");
        } else {
            txtpass.selectAll();
        }
    }//GEN-LAST:event_txtpassFocusGained

    private void txtuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusGained
        if (txtuser.getText().equals("Nombre de usuario")) {
            txtuser.setText("");
        } else {
            txtuser.selectAll();
        }
    }//GEN-LAST:event_txtuserFocusGained

    private void txtuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtuserFocusLost
        if (txtuser.getText().equals("")) {
            txtuser.setText("Nombre de usuario");
        }
    }//GEN-LAST:event_txtuserFocusLost

    private void txtuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean numeros = key >= 48 && key <= 57;
        if (txtuser.getText().trim().length() == 17) {
            evt.consume();
        }
        if (!(minusculas || mayusculas || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtuserKeyTyped

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        if (txtpass.getText().trim().length() == 8) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean espacio = key == 32;
        if (espacio) {
            evt.consume();
        }
    }//GEN-LAST:event_txtpassKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginNuevo().setVisible(true);
            }
        });
    }

//    public void ventana() {
//        setSize(350, 400);
//        setResizable(false);
//        setTitle("Iniciar sesion");
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//
//        ImageIcon wallpaper = new ImageIcon("src/Imagenes/1.jpg");
//        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(Fondo.getWidth(),
//                Fondo.getHeight(), Image.SCALE_DEFAULT));
//        Fondo.setIcon(icono);
//        this.repaint();
//
//        ImageIcon wallapper_logo = new ImageIcon("src/Imagenes/UserIcon.png");
//        Icon icono_logo = new ImageIcon(wallapper_logo.getImage().getScaledInstance(Icono.getWidth(),
//                Icono.getHeight(), Image.SCALE_DEFAULT));
//        Icono.setIcon(icono_logo);
//        this.repaint();
//
//        Tipo.addItem("Administrador");
//        Tipo.addItem("Asistente");
//    }

    public void Verif() {

        VPrinc vp = new VPrinc();
        Metodos m = new Metodos();

        boolean v = false;
        boolean v2 =true;

        m.DeArchivoAMatriz(User, ruta);

        if (Tipo.getSelectedItem().toString().equals("Tipo de usuario")) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de usuario");
        } else {

//            JOptionPane.showMessageDialog(null, "Funcionando"+"\nuser: "+txtuser.getText()
//            +"\npass"+txtpass.getText().toString());
            if (txtuser.getText().equals("Nombre de usuario") && txtpass.getText().equals("Contraseña")) {
                JOptionPane.showMessageDialog(null, "Ingrese los datos de usuario");
            } else {
                if (txtuser.getText().equals("Administrador") && txtpass.getText().equals("Admin_*1")
                        && Tipo.getSelectedItem().toString().equals("Administrador")) {
                    m.setAdmin("true");
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                    v = true;
                 
                    vp.setVisible(true);
                    this.dispose();
                }
                
                String ms="";
                for (int i = 0; i < User.length; i++) {

                    if ((txtuser.getText().equals(User[i][2]) && !txtpass.getText().equals(User[i][3]))
                            || (!txtuser.getText().equals(User[i][2]) && txtpass.getText().equals(User[i][3]))
                            || (txtuser.getText().equals(User[i][2]) && txtpass.getText().equals(User[i][3])
                            && !Tipo.getSelectedItem().toString().equals(User[i][4]))
                            || (!txtuser.getText().equals(User[i][2]) && !txtpass.getText().equals(User[i][3])
                            && Tipo.getSelectedItem().toString().equals(User[i][4]))) {
                        
                        if (!v && i==User.length-1) {
                            JOptionPane.showMessageDialog(null, "Usuario, contraseña o tipo incorrecto");
                            
//                            JOptionPane.showMessageDialog(null,User[i][2]+" , "+User[i][3]+" , "+User[i][4]+" lenght "+User.length);
                            
                            for(i=0;i<User.length;i++){
                                for(int j=0;j<5;j++){
                                    ms+="["+User[i][j]+"]";
                                }
                                ms+="\n";
                            }
//                            JOptionPane.showMessageDialog(null, ms);
                            
                            break;
                        }
                    } else {  
                        if (txtuser.getText().equals(User[i][2]) && txtpass.getText().equals(User[i][3])
                                && Tipo.getSelectedItem().toString().equals(User[i][4])) {

                            if (Tipo.getSelectedItem().toString().equals("Administrador")) {
                                m.setAdmin("true");
                                JOptionPane.showMessageDialog(null, "Bienvenido "+User[i][2]);
                                vp.setVisible(true);
                                this.dispose();
                                break;

                            }
                            if (Tipo.getSelectedItem().toString().equals("Asistente")) {
                                m.setAdmin("false");
                                JOptionPane.showMessageDialog(null, "Bienvenido "+User[i][2]);
                                vp.setVisible(true);
                                this.dispose();
                                break;
                            }
                        } else {
                        }
                    }
                }//for i
            }//else de usuario y contraseña 
        }//else tipo usuario

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icono;
    private javax.swing.JButton Iniciarsesion;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
