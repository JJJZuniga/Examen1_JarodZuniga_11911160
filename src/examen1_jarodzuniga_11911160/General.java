/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_jarodzuniga_11911160;

/**
 *
 * @author Jhon Zuniga
 */
public class General extends Personas{
    protected String ocupacion, horario,tiempo_trab;
    protected double sueldo;

    public General() {
    }

    public General(String ocupacion, String horario, String tiempo_trab, double sueldo) {
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo_trab = tiempo_trab;
        this.sueldo = sueldo;
    }

    public General(String ocupacion, String horario, String tiempo_trab, double sueldo, String identificacion, String Nombre, String Sexo, String estado_Civil, int edad, double Altura, double Peso) {
        super(identificacion, Nombre, Sexo, estado_Civil, edad, Altura, Peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo_trab = tiempo_trab;
        this.sueldo = sueldo;
    }

   

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTiempo_trab() {
        return tiempo_trab;
    }

    public void setTiempo_trab(String tiempo_trab) {
        this.tiempo_trab = tiempo_trab;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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
        return "ocupacion=" + ocupacion + ", horario=" + horario + ", tiempo_trab=" + tiempo_trab + ", sueldo=" + sueldo;
    }

    
    
    
}
