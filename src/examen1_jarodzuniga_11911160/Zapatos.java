
package examen1_jarodzuniga_11911160;


public class Zapatos extends Objetos{
    protected String  talla, Descripción_sue;
    protected int  comodidad;

    public Zapatos() {
    }

    public Zapatos(String talla, String Descripción_sue, int comodidad) {
        this.talla = talla;
        this.Descripción_sue = Descripción_sue;
        this.comodidad = comodidad;
    }

    public Zapatos(String talla, String Descripción_sue, int comodidad, String color, String descripción, String marca, String Tamaño, String calidad, String persona_ingreso) {
        super(color, descripción, marca, Tamaño, calidad, persona_ingreso);
        this.talla = talla;
        this.Descripción_sue = Descripción_sue;
        this.comodidad = comodidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDescripción_sue() {
        return Descripción_sue;
    }

    public void setDescripción_sue(String Descripción_sue) {
        this.Descripción_sue = Descripción_sue;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
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
        return "talla=" + talla + ", Descripci\u00f3n_sue=" + Descripción_sue + ", comodidad=" + comodidad;
    }
    
}
