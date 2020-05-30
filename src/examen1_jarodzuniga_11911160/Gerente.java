
package examen1_jarodzuniga_11911160;


public class Gerente extends Personas{
    protected String usuario,contraseña, cargo;

    public Gerente() {
    }

    public Gerente(String identificacion, String Nombre, String Sexo, String estado_Civil, int edad, double Altura, double Peso) {
        super(identificacion, Nombre, Sexo, estado_Civil, edad, Altura, Peso);
    }

    public Gerente(String usuario, String contraseña, String cargo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public Gerente(String usuario, String contraseña, String cargo, String identificacion, String Nombre, String Sexo, String estado_Civil, int edad, double Altura, double Peso) {
        super(identificacion, Nombre, Sexo, estado_Civil, edad, Altura, Peso);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    Gerente(String identificacion, String nombre, String sexo, String estado, double altu, double pes, String user, String cont, String car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado_Civil() {
        return estado_Civil;
    }

    public void setEstado_Civil(String estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "usuario=" + usuario + ", contraseña=" + contraseña + ", cargo=" + cargo;
    }
    
}
