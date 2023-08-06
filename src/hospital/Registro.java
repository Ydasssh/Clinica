package hospital;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Registro extends javax.swing.JFrame {

    File archivo = new File("C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\usuarios.txt");
    String Musers[][] = new String[10][5];
    int nU = 0;
    String ruta = "C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\usuarios.txt";

    public Registro() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        mostrarMatriz(Musers);
//        ventana();

    }

    public class Usuarios {

        String Cedula = "";
        String Nombre = "";
        String User = "";
        String Pass = "";
        String Tipo = "";
    }

    public static Registros[] registros = new Registros[10];

    private static boolean Contraseñavalida(JTextField txtPass) {
        String cadena = "";
        String contraseña = txtPass.getText();
        boolean valido = true;

        if (contraseña.length() < 6 || contraseña.length() > 8) {
            cadena += "La contraseña solo puede tener de 6 a 8 caracteres";
            valido = false;
        }

        boolean Mayus = false;
        boolean Minus = false;
        boolean Num = false;
        boolean Signo = false;

        for (int i = 0; i < contraseña.length(); i++) {
            char n = contraseña.charAt(i);

            if (Character.isUpperCase(n)) {
                Mayus = true;
            }
            if (Character.isLowerCase(n)) {
                Minus = true;
            }
            if (Character.isDigit(n)) {
                Num = true;
            }
            if (n == '.' || n == '!' || n == '&' || n == '*' || n == '_') {
                Signo = true;
            }
        }

        if (!Mayus) {
            cadena += "\nLa contraseña debe tener al menos una letra mayuscula";
            valido = false;
        }

        if (!Minus) {
            cadena += "\nLa contraseña debe tener al menos una letra minuscula";
            valido = false;
        }

        if (!Num) {
            cadena += "\nLa contraseña debe tener al menos un numero";
            valido = false;
        }

        if (!Signo) {
            cadena += "\nLa contraseña debe tener al menos un signo de estos .!&*_ ";
            valido = false;
        }

        if (cadena != "") {
            JOptionPane.showMessageDialog(null, cadena);
        }
        return valido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        refresh = new javax.swing.JToggleButton();
        txtPass = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();
        Registro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Registro1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de usuarios");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Usuario", "Contraseña", "Tipo de usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 490, 180));

        jLabel1.setText("Cedula:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("Nombre de usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refresh.png"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 35, 27));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 120, -1));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, -1));

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 100, -1));

        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 120, -1));

        jLabel5.setText("Tipo de usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de usuario", "Administrador", "Asistente" }));
        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 120, -1));

        Registro.setText("Eliminar Usuario");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 130, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 40, 30));

        Registro1.setText("Registrar");
        Registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro1ActionPerformed(evt);
            }
        });
        jPanel1.add(Registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 120, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 420));

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
        private void todaslascasillas() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtUser.setText("");
        txtPass.setText("");
    }

    private void casillauser() {
        txtUser.setText("");
    }
    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        EliminarUser eu = new EliminarUser();

        eu.setVisible(true);
    }//GEN-LAST:event_RegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VPrinc vp = new VPrinc();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusGained

    }//GEN-LAST:event_txtCedulaFocusGained

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost

    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (txtCedula.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained

    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost

    }//GEN-LAST:event_txtUserFocusLost

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean numeros = key >= 48 && key <= 57;
        if (txtUser.getText().trim().length() == 17) {
            evt.consume();
        }
        if (!(minusculas || mayusculas || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained

    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost

    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (txtNombre.getText().trim().length() == 20) {
            evt.consume();
        }
        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        Metodos m = new Metodos();

        m.DeArchivoAMatriz(Musers, ruta);
        mostrarMatriz(Musers);
        
    }//GEN-LAST:event_refreshActionPerformed

    private void Registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro1ActionPerformed

        verifCampos();


    }//GEN-LAST:event_Registro1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    public void registrar() {
        String nom, id, passw, user;
        try {

            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));

            nom = txtNombre.getText();
            id = txtCedula.getText();
            passw = txtPass.getText();
            user = txtUser.getText();
            String tipo = Tipo.getSelectedItem().toString();

            String me = id + ";" + nom + ";" + user + ";" + passw + ";" + tipo + ";";

            Fescribe.write(me + "\r\n");
            System.out.println("Registro realizado");
            txtNombre.setText("");
            txtCedula.setText("");
            txtUser.setText("");
            txtPass.setText("");

            Fescribe.close();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }


    public void mostrarMatriz(String a[][]) {
        Metodos m = new Metodos();

        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();

        m.DeArchivoAMatriz(a, ruta);

        
        
        model.setRowCount(10);
        model.setColumnCount(5);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                Tabla.setValueAt(a[i][j], i, j);
            }
        }
    }

    public void verifCampos() {
        Registros r = new Registros();
        Metodos m = new Metodos();

        if (txtNombre.getText().equals("") || txtCedula.getText().equals("") || txtUser.getText().equals("")
                || txtPass.getText().equals("") || Tipo.getSelectedItem().toString().equals("Tipo de usuario")) {

            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");

        } else {
            if (!Contraseñavalida(txtPass)) {

            } else {

                if (!m.verificarID(txtCedula.getText(), ruta) && !m.verificarUser(txtUser.getText(), ruta)) {
                    String nom = txtNombre.getText();
                    String id = txtCedula.getText();
                    String passw = txtPass.getText();
                    String user = txtUser.getText();
                    String tipo = Tipo.getSelectedItem().toString();

                    r.AgregarU(registros, nom, id, user, passw, tipo, nU);
                    nU++;
                    registrar();

                    JOptionPane.showMessageDialog(null, "Registro Exitoso");

                    txtNombre.setText("");
                    txtCedula.setText("");
                    txtUser.setText("");
                    txtPass.setText("");

                    r.mostrar(registros, nU);
                } else {
                    if (m.verificarID(txtCedula.getText(), ruta)) {
                        JOptionPane.showMessageDialog(null, "El numero de identificación ya se encuentra registrado\n\n\tPor favor ingrese otro");
                        txtCedula.setText("");

                    }
                    if (m.verificarUser(txtUser.getText(), ruta)) {
                        JOptionPane.showMessageDialog(null, "El nombre de usuario ya se encuentra registrado\n\n\tPor favor ingrese otro");
                        txtUser.setText("");
                    }
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Registro;
    private javax.swing.JButton Registro1;
    private javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton refresh;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
