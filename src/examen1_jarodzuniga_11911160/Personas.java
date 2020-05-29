
package examen1_jarodzuniga_11911160;


public class Personas {
    protected String identificacion, Nombre, Sexo,estado_Civil;
    protected int  edad ;
    protected double  Altura, Peso;

    public Personas() {
    }

    public Personas(String identificacion, String Nombre, String Sexo, String estado_Civil, int edad, double Altura, double Peso) {
        this.identificacion = identificacion;
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.estado_Civil = estado_Civil;
        this.edad = edad;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificación(String identificación) {
        this.identificacion = identificación;
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
        return "identificacion=" + identificacion + " Nombre=" + Nombre + " Sexo=" + Sexo + " Estado Civil=" + estado_Civil + " edad=" + edad + " Altura=" + Altura + " Peso=" + Peso ;
    }
    
    
}
