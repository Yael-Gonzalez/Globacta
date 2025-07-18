package utez.integradoraglobacta.Models;

public class Institucion {
    private String id_Institucion;
    private String nombre_Institucion;

    public Institucion() {
    }

    public Institucion(String id_Institucion, String nombre_Institucion) {
        this.id_Institucion = id_Institucion;
        this.nombre_Institucion = nombre_Institucion;
    }

    public String getId_Institucion() {
        return id_Institucion;
    }

    public void setId_Institucion(String id_Institucion) {
        this.id_Institucion = id_Institucion;
    }

    public String getNombre_Institucion() {
        return nombre_Institucion;
    }

    public void setNombre_Institucion(String nombre_Institucion) {
        this.nombre_Institucion = nombre_Institucion;
    }
}
