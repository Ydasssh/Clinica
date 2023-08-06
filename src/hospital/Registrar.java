package hospital;

public class Registrar {

    public static String Cedula = "", Nombre = "", User = "", Pass = "", tipo = "";

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        Registrar.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Registrar.Nombre = Nombre;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        Registrar.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        Registrar.Pass = Pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        Registrar.tipo = Tipo;
    }

}