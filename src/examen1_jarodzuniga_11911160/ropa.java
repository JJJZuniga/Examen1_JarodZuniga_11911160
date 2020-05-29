
package examen1_jarodzuniga_11911160;


public class ropa extends Objetos{
    protected String  talla,tela,pais;

    public ropa() {
    }

    public ropa(String talla, String tela, String pais) {
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public ropa(String talla, String tela, String pais, String color, String descripción, String marca, String Tamaño, String calidad, String persona_ingreso) {
        super(color, descripción, marca, Tamaño, calidad, persona_ingreso);
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        return "talla=" + talla + ", tela=" + tela + ", pais=" + pais;
    }
    
}
