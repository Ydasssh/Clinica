package hospital;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Metodos {

    AddPaciente ap = new AddPaciente();

    String nombre, apellido, id, hab;

    public void Agregar(Metodos a[], String nombre, String apellido, String id, String hab, int i) {
        a[i] = new Metodos();
        a[i].nombre = nombre;
        a[i].apellido = apellido;
        a[i].id = id;
        a[i].hab = hab;
    }

    public String mostrar(Metodos a[], int n) {
        int i;
        String m = "Pacientes\n";
        for (i = 0; i < n; i++) {
            m += "Nombre:" + a[i].nombre + "\n" + "Apellido:" + a[i].apellido + "\n"
                    + "Id:" + a[i].id + "\n" + "Codigo de Habitación:" + a[i].hab + "\n\n";
        }
        return (m);
    }

    public void DeArchivoAMatriz(String Matriz[][], String ruta) {

        //Tamaño de matriz
        int rows = 0;
        int cols = 0;

        try ( Scanner scanner = new Scanner(new File(ruta))) {
            while (scanner.hasNextLine()) {
                rows++;
                String line = scanner.nextLine();
                cols = line.split(";").length;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Llenar matriz
        try ( Scanner scanner = new Scanner(new File(ruta))) {
            int row = 0;
            while (scanner.hasNextLine()) {
                String[] linea = scanner.nextLine().split(";");
                for (int col = 0; col < cols; col++) {
                    Matriz[row][col] = linea[col];
                }
                row++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String[] row : Matriz) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static String Admin = "";

    public static void setAdmin(String Admin) {
        Metodos.Admin = Admin;
    }

    public static String getAdmin() {
        return Admin;
    }

    public static void eliminarLinea(String nombreArchivo, int numeroLinea) {

        if (numeroLinea != -1 && numeroLinea > 0) {
            try {
                // Crear un archivo temporal
                File archivoTemporal = new File("temp.txt");

                // Abrir el archivo original para leer
                BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));

                // Abrir el archivo temporal para escribir
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal));

                String lineaActual;
                int numeroLineaActual = 1;

                // Leer todas las líneas del archivo original y escribir todas las líneas, excepto la línea que se quiere eliminar
                while ((lineaActual = br.readLine()) != null) {
                    if (numeroLineaActual != numeroLinea) {
                        bw.write(lineaActual);
                        bw.newLine();
                    }
                    numeroLineaActual++;
                }

                // Cerrar los archivos
                br.close();
                bw.close();

                // Eliminar el archivo original
                File archivoOriginal = new File(nombreArchivo);
                archivoOriginal.delete();

                // Renombrar el archivo temporal con el nombre del archivo original
                archivoTemporal.renameTo(archivoOriginal);

                System.out.println("La línea " + numeroLinea + " ha sido eliminada del archivo " + nombreArchivo + ".");

            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error de entrada/salida: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Id -1");
        }

    }

    public static int buscarLineaPorId(String nombreArchivo, String idBuscado) {
        int numLinea = 0;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea = lector.readLine();
            while (linea != null) {
                numLinea++;
                if (linea.contains(idBuscado)) {
                    lector.close();
                    return numLinea;
                }
                linea = lector.readLine();
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
        }
        return -1;
    }

    public static boolean verificarID(String id, String Archivo) {

        boolean v = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(Archivo));
            String linea = lector.readLine();
            while (linea != null) {
                if (linea.contains(id)) {
                    lector.close();
                    return true;
                }
                linea = lector.readLine();
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + Archivo + ": " + e.getMessage());
        }
        return false;
    }

    public static boolean verificarHab(String Hab, String Archivo) {
        boolean v = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(Archivo));
            String linea = lector.readLine();
            while (linea != null) {
                if (linea.contains(Hab)) {
                    lector.close();
                    return true;
                }
                linea = lector.readLine();
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + Archivo + ": " + e.getMessage());
        }
        return false;
    }

    public static boolean verificarUser(String User, String Archivo) {
        boolean v = false;
        try {
            BufferedReader lector = new BufferedReader(new FileReader(Archivo));
            String linea = lector.readLine();
            while (linea != null) {
                if (linea.contains(User)) {
                    lector.close();
                    return true;
                }
                linea = lector.readLine();
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + Archivo + ": " + e.getMessage());
        }
        return false;
    }

    public static void HabUso(String archivo1, String archivo2) {
        BufferedReader lector1 = null;
        BufferedReader lector2 = null;
        BufferedWriter escritor = null;
        String temp = "C:\\Users\\Casa\\Documents\\NetBeansProjects\\Hospital\\src\\Archivo\\temporal.txt";
        try {
            lector1 = new BufferedReader(new FileReader(archivo1));
            lector2 = new BufferedReader(new FileReader(archivo2));
            escritor = new BufferedWriter(new FileWriter(temp));

            String linea1 = lector1.readLine();
            String linea2 = lector2.readLine();

            while (linea1 != null && linea2 != null) {
                String[] datos1 = linea1.split(";");
                String[] datos2 = linea2.split(";");

                if (datos1[3].equals(datos2[0])) {
                    datos2[2] = "1"; // Modificar el dato 3 del segundo archivo

                    String nuevaLinea2 = String.join(";", datos2); // Crear la nueva línea con el cambio
                    escritor.write(nuevaLinea2); // Escribir la nueva línea en el archivo temporal
                } else {
                    escritor.write(linea2); // Escribir la línea original del segundo archivo en el archivo temporal
                }

                linea1 = lector1.readLine();
                linea2 = lector2.readLine();

                if (linea1 != null || linea2 != null) {
                    escritor.newLine(); // Añadir un salto de línea después de cada línea escrita
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer o escribir en los archivos: " + e.getMessage());
        } finally {
            try {
                if (lector1 != null) {
                    lector1.close();
                }
                if (lector2 != null) {
                    lector2.close();
                }
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los archivos: " + e.getMessage());
            }
        }

        // Reemplazar el archivo original por el archivo temporal
        File archivoOriginal = new File(archivo2);
        File archivoTemporal = new File(temp);
        archivoTemporal.renameTo(archivoOriginal);
    }

    public static String[][] compM2(String a[][], String b[][]) {

        AddPaciente ap = new AddPaciente();
        String vA = "";
        int i = 0;
        int x = 0;
        while (a[i][3] != null) {
            vA = a[i][3];
            for (int j = x; j < b.length; j++) {
                if (b[j][0].equals(vA)) {
                    b[j][2] = "En uso";
                    if (b[j][2].equals("En uso")) {
                        x++;
                        break;
                    }
                } else {
//                    JOptionPane.showMessageDialog(null, "?");
                    b[j][2] = "Sin uso";
                }
            }
            i++;
        }
        return b;
    }

    public static String[][] enUso(String a[][], String b[][]) {

        for (int i = 0; i < a.length && a[i][3] != null; i++) {
            String vA = a[i][3];
            for (int j = 0; j < b.length; j++) {
                if (b[j][2].equals("0")) {
                    b[j][2] = "Disponible";
                }
                if (vA.equals(b[j][0])) {
                    b[j][2] = "Ocupado";
                } else {

                }
            }
        }

        return b;
    }

}
