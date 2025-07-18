package utez.integradoraglobacta.Models;

public class Estudiante {
    private int id_Estudiante;
    private String nombre_Estudiante;
    private String rol_Estudiante;
    private String id_Institucion;
    private int id_Evento;


    public Estudiante() {
    }

    public Estudiante(int id_Estudiante, String nombre_Estudiante, String rol_Estudiante, String id_Institucion, int id_Evento) {
        this.id_Estudiante = id_Estudiante;
        this.nombre_Estudiante = nombre_Estudiante;
        this.rol_Estudiante = rol_Estudiante;
        this.id_Institucion = id_Institucion;
        this.id_Evento = id_Evento;
    }

    public int getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(int id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public String getNombre_Estudiante() {
        return nombre_Estudiante;
    }

    public void setNombre_Estudiante(String nombre_Estudiante) {
        this.nombre_Estudiante = nombre_Estudiante;
    }

    public String getRol_Estudiante() {
        return rol_Estudiante;
    }

    public void setRol_Estudiante(String rol_Estudiante) {
        this.rol_Estudiante = rol_Estudiante;
    }

    public String getId_Institucion() {
        return id_Institucion;
    }

    public void setId_Institucion(String id_Institucion) {
        this.id_Institucion = id_Institucion;
    }

    public int getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(int id_Evento) {
        this.id_Evento = id_Evento;
    }
}
