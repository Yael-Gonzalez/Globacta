/*
package utez.integradoraglobacta.Models;

import java.time.LocalDate;

public class Evento {
    private int id_Evento;
    private String nombre_Evento;
    private LocalDate fecha_Inicio_Evento;
    private LocalDate fecha_Fin_Evento;
    private String lugar_Evento;
    private String descripcion_Evento;
    private byte[] imagen_Evento;
}
*/
package utez.integradoraglobacta.Models;

import java.time.LocalDate;

public class Evento {
    private int id_Evento;
    private String nombre_Evento;
    private LocalDate fecha_Inicio_Evento;
    private LocalDate fecha_Fin_Evento;
    private String lugar_Evento;
    private String descripcion_Evento;
    private byte[] imagen_Evento;

    // Constructor vacío
    public Evento() {
    }

    // Constructor completo
    public Evento(int id_Evento, String nombre_Evento, LocalDate fecha_Inicio_Evento, LocalDate fecha_Fin_Evento, String lugar_Evento, String descripcion_Evento, byte[] imagen_Evento) {
        this.id_Evento = id_Evento;
        this.nombre_Evento = nombre_Evento;
        this.fecha_Inicio_Evento = fecha_Inicio_Evento;
        this.fecha_Fin_Evento = fecha_Fin_Evento;
        this.lugar_Evento = lugar_Evento;
        this.descripcion_Evento = descripcion_Evento;
        this.imagen_Evento = imagen_Evento;
    }

    public int getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(int id_Evento) {
        this.id_Evento = id_Evento;
    }

    public String getNombre_Evento() {
        return nombre_Evento;
    }

    public void setNombre_Evento(String nombre_Evento) {
        this.nombre_Evento = nombre_Evento;
    }

    public LocalDate getFecha_Inicio_Evento() {
        return fecha_Inicio_Evento;
    }

    public void setFecha_Inicio_Evento(LocalDate fecha_Inicio_Evento) {
        this.fecha_Inicio_Evento = fecha_Inicio_Evento;
    }

    public LocalDate getFecha_Fin_Evento() {
        return fecha_Fin_Evento;
    }

    public void setFecha_Fin_Evento(LocalDate fecha_Fin_Evento) {
        this.fecha_Fin_Evento = fecha_Fin_Evento;
    }

    public String getLugar_Evento() {
        return lugar_Evento;
    }

    public void setLugar_Evento(String lugar_Evento) {
        this.lugar_Evento = lugar_Evento;
    }

    public String getDescripcion_Evento() {
        return descripcion_Evento;
    }

    public void setDescripcion_Evento(String descripcion_Evento) {
        this.descripcion_Evento = descripcion_Evento;
    }

    public byte[] getImagen_Evento() {
        return imagen_Evento;
    }

    public void setImagen_Evento(byte[] imagen_Evento) {
        this.imagen_Evento = imagen_Evento;
    }
}