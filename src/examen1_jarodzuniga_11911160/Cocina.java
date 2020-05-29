
package examen1_jarodzuniga_11911160;


public class Cocina extends Objetos{
    protected String descripcion_pertenecen, instrucciones, garantía;

    public Cocina() {
    }

    public Cocina(String descripcion_pertenecen, String instrucciones, String garantía) {
        this.descripcion_pertenecen = descripcion_pertenecen;
        this.instrucciones = instrucciones;
        this.garantía = garantía;
    }

    public Cocina(String descripcion_pertenecen, String instrucciones, String garantía, String color, String descripción, String marca, String Tamaño, String calidad, String persona_ingreso) {
        super(color, descripción, marca, Tamaño, calidad, persona_ingreso);
        this.descripcion_pertenecen = descripcion_pertenecen;
        this.instrucciones = instrucciones;
        this.garantía = garantía;
    }

    public String getDescripción_pertenecen() {
        return descripcion_pertenecen;
    }

    public void setDescripción_pertenecen(String descripción_pertenecen) {
        this.descripcion_pertenecen = descripción_pertenecen;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getGarantía() {
        return garantía;
    }

    public void setGarantía(String garantía) {
        this.garantía = garantía;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getPersona_ingreso() {
        return persona_ingreso;
    }

    public void setPersona_ingreso(String persona_ingreso) {
        this.persona_ingreso = persona_ingreso;
    }

    @Override
    public String toString() {
        return "descripcion_pertenecen=" + descripcion_pertenecen + ", instrucciones=" + instrucciones + ", garant\u00eda=" + garantía + '}';
    }
    
}
