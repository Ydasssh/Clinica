/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import javax.swing.JOptionPane;

public class Temporal {

    public static String name = "", apellido = "", id = "", hab = "";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Temporal.name = name;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Temporal.apellido = apellido;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Temporal.id = id;
    }

    public static String getHab() {
        return hab;
    }

    public static void setHab(String hab) {
        Temporal.hab = hab;
    }

//    if (Matriz[i][j].equals("")) {
//                        JOptionPane.showMessageDialog(null, " i: "+i+ " j: "+j);
//                    //ID   
//                    if (j == 0) {
//                        if (i == 0) {
//                            Matriz[i][j] = tm.getId().trim();
//                            id = true;
//
//                        }else{
//                        if (i > 0 && Matriz[i-1][0].contains(tm.getId().trim())) {
//                            JOptionPane.showMessageDialog(null, "El ID ya existe"+" i: "+i);
//                            Matriz[i][j] = "";
//                            h = false;
//
//                        } else {
//                            Matriz[i][j] = tm.getId().trim();
//                            id = true;
//
//                            }
//                        }
//                    }
//                
//                //ID
//
//                //Hab                
//                if (j == 1) {
//                    if (i == 0 && id) {
//                        Matriz[i][j] = tm.getHab().trim();
//                        h = true;
//
//                    } else {
//                        if (i > 0 && Matriz[i-1][1].contains(tm.getHab().trim()) && id) {
//                            JOptionPane.showMessageDialog(null, "La habitacion está en uso");
//                            Matriz[i][j] = "";
//                            h = false;
//                        } else {
//                            if (id) {
//                                Matriz[i][j] = tm.getHab().trim();
//                                h = true;
//
//                            }
//                        }
//
//                    }
//                    //Hab
//
//                    if (id && h) {
//                        if (j == 2) {
//                            Matriz[i][j] = tm.getName().trim();
//                        }
//                        if (j == 3) {
//                            Matriz[i][j] = tm.getApellido().trim();
//                            v = true;
//                            break;
//                        }
//                    } else {
//                        v = true;
//                    }
//
//                } else {
//                    continue;
//                }
//
//                }
//            }
//
//            if (v) {
//                break;
//            }
//
//        }
}
