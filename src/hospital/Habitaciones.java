/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital;

import static hospital.DAlta.contarFilas;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Habitaciones extends javax.swing.JFrame {

    String HabitacionesT[][] = {
        {"001", "1", "Disponible"},
        {"002", "2", "Disponible"},
        {"003", "3", "Disponible"},
        {"004", "4", "Disponible"},
        {"005", "5", "Disponible"},
        {"006", "6", "Disponible"},
        {"007", "7", "Disponible"},
        {"008", "8", "Disponible"},
        {"009", "9", "Disponible"},
        {"010", "10", "Disponible"},
        {"011", "11", "Disponible"},
        {"012", "12", "Disponible"},
        {"013", "13", "Disponible"},
        {"014", "14", "Disponible"},
        {"015", "15", "Disponible"},
        {"016", "16", "Disponible"},
        {"017", "17", "Disponible"},
        {"018", "18", "Disponible"},
        {"019", "19", "Disponible"},
        {"020", "20", "Disponible"},
        {"021", "21", "Disponible"},
        {"022", "22", "Disponible"},
        {"023", "23", "Disponible"},
        {"024", "24", "Disponible"},
        {"025", "25", "Disponible"},
        {"026", "26", "Disponible"},
        {"027", "27", "Disponible"},
        {"028", "28", "Disponible"},
        {"029", "29", "Disponible"},
        {"030", "30", "Disponible"},
        {"031", "31", "Disponible"},
        {"032", "32", "Disponible"},
        {"033", "33", "Disponible"},
        {"034", "34", "Disponible"},
        {"035", "35", "Disponible"},
        {"036", "36", "Disponible"},
        {"037", "37", "Disponible"},
        {"038", "38", "Disponible"},
        {"039", "39", "Disponible"},
        {"040", "40", "Disponible"},
        {"041", "41", "Disponible"},
        {"042", "42", "Disponible"},
        {"043", "43", "Disponible"},
        {"044", "44", "Disponible"},
        {"045", "45", "Disponible"},
        {"046", "46", "Disponible"},
        {"047", "47", "Disponible"},
        {"048", "48", "Disponible"},
        {"049", "49", "Disponible"},
        {"050", "50", "Disponible"},
        {"051", "51", "Disponible"},
        {"052", "52", "Disponible"},
        {"053", "53", "Disponible"},
        {"054", "54", "Disponible"},
        {"055", "55", "Disponible"},
        {"056", "56", "Disponible"},
        {"057", "57", "Disponible"},
        {"058", "58", "Disponible"},
        {"059", "59", "Disponible"},
        {"060", "60", "Disponible"},
        {"061", "61", "Disponible"},
        {"062", "62", "Disponible"},
        {"063", "63", "Disponible"},
        {"064", "64", "Disponible"},
        {"065", "65", "Disponible"},
        {"066", "66", "Disponible"},
        {"067", "67", "Disponible"},
        {"068", "68", "Disponible"},
        {"069", "69", "Disponible"},
        {"070", "70", "Disponible"},
        {"071", "71", "Disponible"},
        {"072", "72", "Disponible"},
        {"073", "73", "Disponible"},
        {"074", "74", "Disponible"},
        {"075", "75", "Disponible"},
        {"076", "76", "Disponible"},
        {"077", "77", "Disponible"},
        {"078", "78", "Disponible"},
        {"079", "79", "Disponible"},
        {"080", "80", "Disponible"},
        {"081", "81", "Disponible"},
        {"082", "82", "Disponible"},
        {"083", "83", "Disponible"},
        {"084", "84", "Disponible"},
        {"085", "85", "Disponible"},
        {"086", "86", "Disponible"},
        {"087", "87", "Disponible"},
        {"088", "88", "Disponible"},
        {"089", "89", "Disponible"},
        {"090", "90", "Disponible"},
        {"091", "91", "Disponible"},
        {"092", "92", "Disponible"},
        {"093", "93", "Disponible"},
        {"094", "94", "Disponible"},
        {"095", "95", "Disponible"},
        {"096", "96", "Disponible"},
        {"097", "97", "Disponible"},
        {"098", "98", "Disponible"},
        {"099", "99", "Disponible"},
        {"100", "100", "Disponible"}};

    String HabitacionesD[][] = new String[100][3];
    String HabitacionesU[][] = new String[100][3];
    String ruta = "C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\Habitaciones.txt";
    File archivo = new File("C:\\Users\\SSS\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\Habitaciones.txt");

    public Habitaciones() {
        initComponents();
        mostrarMatriz(HabitacionesT, HabitacionesU, HabitacionesD);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Panel = new javax.swing.JTextArea();
        Home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        Disponibles = new javax.swing.JCheckBox();
        Ocupados = new javax.swing.JCheckBox();
        Refresh = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Habitaciones");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Hab", "N° Hab", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, 270));

        Panel.setEditable(false);
        Panel.setColumns(20);
        Panel.setRows(5);
        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 220, 100));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casa.png"))); // NOI18N
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 40, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText(" codigo de habitación:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Consultar por");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 30, 30));
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 30));

        Disponibles.setText("Disponibles");
        jPanel1.add(Disponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        Ocupados.setText("Ocupados");
        jPanel1.add(Ocupados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtro.png"))); // NOI18N
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 30, 30));

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dar de alta.png"))); // NOI18N
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 40, 30));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(350, 400));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 480));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        AddPaciente ap = new AddPaciente();
        mostrarMatriz(HabitacionesT, HabitacionesU, HabitacionesD);


    }//GEN-LAST:event_RefreshActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        DAlta da = new DAlta();

        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mhabitaciones m = new Mhabitaciones();

        Panel.setText("");

        boolean v = false;
        String Cod = txtCod.getText();
        if (!txtCod.getText().isEmpty()) {
            int n = contarFilas(m.ruta);

            String resultado = "";

            for (int i = 0; i < n; i++) {
                if (m.Pacientes[i][3].equals(Cod)) {
                    resultado += "Nombre: " + m.Pacientes[i][0] + "\n";
                    resultado += "Apellido: " + m.Pacientes[i][1] + "\n";
                    resultado += "Identificación: " + m.Pacientes[i][2] + "\n";
                    resultado += "Código de Habitación: " + m.Pacientes[i][3] + "\n";
                    v = false;
                    Panel.append(resultado);
                    break;
                } else {
                    v = true;
                }
            }

            if (v) {
                JOptionPane.showMessageDialog(null, "La habitación no tiene registrado ningun paciente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de habitación");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        VPrinc vp = new VPrinc();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

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
            java.util.logging.Logger.getLogger(Habitaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitaciones().setVisible(true);
            }
        });
    }

    public void mostrarMatriz(String a[][], String b[][], String c[][]) {

        Metodos m = new Metodos();
        Mhabitaciones mh = new Mhabitaciones();

        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();

        model.setRowCount(100);
        model.setColumnCount(3);

        if (Ocupados.isSelected() && !Disponibles.isSelected()) {

            FiltroOcupados(a, b);
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 3; j++) {
                    Tabla.setValueAt(b[i][j], i, j);
                }
            }
        }
        if (Disponibles.isSelected() && !Ocupados.isSelected()) {

            FiltroDisp(a, c);
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 3; j++) {
                    Tabla.setValueAt(c[i][j], i, j);
                }
            }
        }
        if (Disponibles.isSelected() && Ocupados.isSelected()) {

            m.enUso(mh.Pacientes, HabitacionesT);
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 3; j++) {
                    Tabla.setValueAt(a[i][j], i, j);
                }
            }
        }
        if (!Disponibles.isSelected() && !Ocupados.isSelected()) {

            m.enUso(mh.Pacientes, HabitacionesT);
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 3; j++) {
                    Tabla.setValueAt(a[i][j], i, j);
                }
            }
        }

    }

    public void FiltroOcupados(String HabT[][], String HabO[][]) {

        int contadorFilas = 0;
        for (int i = 0; i < HabT.length; i++) {
            if (HabT[i][2].equals("Ocupado")) {
                HabO[contadorFilas] = HabT[i];
                contadorFilas++;
            }
        }
    }

    public void FiltroDisp(String HabT[][], String HabD[][]) {

        int contadorFilas = 0;
        for (int i = 0; i < HabT.length; i++) {
            if (HabT[i][2].equals("Disponible")) {
                HabD[contadorFilas] = HabT[i];
                contadorFilas++;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JCheckBox Disponibles;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Home;
    private javax.swing.JCheckBox Ocupados;
    private javax.swing.JTextArea Panel;
    private javax.swing.JButton Refresh;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCod;
    // End of variables declaration//GEN-END:variables
}