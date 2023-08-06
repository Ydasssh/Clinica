
package hospital;
 class Registros {
     
     String Nombre,Cedula,User,Pass,tipo;
     
     
     
     public void AgregarU(Registros a[], String nombre, String id, String user, String pass, String tipo, int i) {
        a[i] = new Registros();
        a[i].Nombre = nombre;
        a[i].Cedula = id;
        a[i].User = user;
        a[i].Pass = pass;
        a[i].tipo=tipo;
    }
     
     public String mostrar(Registros a[], int n) {
        int i;
        String m = "Pacientes\n";
        for (i = 0; i < n; i++) {
            m += "Nombre:" + a[i].Nombre + "\n" + "Apellido:" + a[i].Cedula + "\n"
                    + "Id:" + a[i].User + "\n" + "Codigo de Habitación:" + a[i].Pass + "\n\n";
        }
        return (m);
    }
}
