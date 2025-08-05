/*package utez.integradoraglobacta.Models;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

public class Asamblea {
    private int id_Asamblea;
    private String nombre_Asamblea;
    private String lugar_Asamblea;
    private Date fecha_Asamblea;
    private Timestamp hora_inicio_Asamblea;
    private LocalDate hora_fin_Asamblea;
    private String descripcion_Asamblea;
    private int id_Evento;

    public Asamblea() {
    }

    public Asamblea(int id_Asamblea, String nombre_Asamblea, String lugar_Asamblea, Date fecha_Asamblea, LocalDate hora_inicio_Asamblea, LocalDate hora_fin_Asamblea, String descripcion_Asamblea, int id_Evento) {
        this.id_Asamblea = id_Asamblea;
        this.nombre_Asamblea = nombre_Asamblea;
        this.lugar_Asamblea = lugar_Asamblea;
        this.fecha_Asamblea = fecha_Asamblea;
        this.hora_inicio_Asamblea = hora_inicio_Asamblea;
        this.hora_fin_Asamblea = hora_fin_Asamblea;
        this.descripcion_Asamblea = descripcion_Asamblea;
        this.id_Evento = id_Evento;
    }

    public int getId_Asamblea() {
        return id_Asamblea;
    }

    public void setId_Asamblea(int id_Asamblea) {
        this.id_Asamblea = id_Asamblea;
    }

    public String getNombre_Asamblea() {
        return nombre_Asamblea;
    }

    public void setNombre_Asamblea(String nombre_Asamblea) {
        this.nombre_Asamblea = nombre_Asamblea;
    }

    public String getLugar_Asamblea() {
        return lugar_Asamblea;
    }

    public void setLugar_Asamblea(String lugar_Asamblea) {
        this.lugar_Asamblea = lugar_Asamblea;
    }

    public Date getFecha_Asamblea() {
        return fecha_Asamblea;
    }

    public void setFecha_Asamblea(Date fecha_Asamblea) {
        this.fecha_Asamblea = fecha_Asamblea;
    }

    public LocalDate getHora_inicio_Asamblea() {
        return hora_inicio_Asamblea;
    }

    public void setHora_inicio_Asamblea(LocalDate hora_inicio_Asamblea) {
        this.hora_inicio_Asamblea = hora_inicio_Asamblea;
    }

    public LocalDate getHora_fin_Asamblea() {
        return hora_fin_Asamblea;
    }

    public void setHora_fin_Asamblea(LocalDate hora_fin_Asamblea) {
        this.hora_fin_Asamblea = hora_fin_Asamblea;
    }

    public String getDescripcion_Asamblea() {
        return descripcion_Asamblea;
    }

    public void setDescripcion_Asamblea(String descripcion_Asamblea) {
        this.descripcion_Asamblea = descripcion_Asamblea;
    }

    public int getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(int id_Evento) {
        this.id_Evento = id_Evento;
    }
}
*/


package utez.integradoraglobacta.Models;

import java.sql.Date;
import java.sql.Timestamp;

public class Asamblea {
    private int id_Asamblea;
    private String nombre_Asamblea;
    private String lugar_Asamblea;
    private Date fecha_Asamblea;
    private Timestamp hora_inicio_Asamblea;
    private Timestamp hora_fin_Asamblea;
    private String descripcion_Asamblea;
    private int id_Evento;

    public Asamblea() {
    }

    public Asamblea(int id_Asamblea, String nombre_Asamblea, String lugar_Asamblea, Date fecha_Asamblea, Timestamp hora_inicio_Asamblea, Timestamp hora_fin_Asamblea, String descripcion_Asamblea, int id_Evento) {
        this.id_Asamblea = id_Asamblea;
        this.nombre_Asamblea = nombre_Asamblea;
        this.lugar_Asamblea = lugar_Asamblea;
        this.fecha_Asamblea = fecha_Asamblea;
        this.hora_inicio_Asamblea = hora_inicio_Asamblea;
        this.hora_fin_Asamblea = hora_fin_Asamblea;
        this.descripcion_Asamblea = descripcion_Asamblea;
        this.id_Evento = id_Evento;
    }

    public int getId_Asamblea() {
        return id_Asamblea;
    }

    public void setId_Asamblea(int id_Asamblea) {
        this.id_Asamblea = id_Asamblea;
    }

    public String getNombre_Asamblea() {
        return nombre_Asamblea;
    }

    public void setNombre_Asamblea(String nombre_Asamblea) {
        this.nombre_Asamblea = nombre_Asamblea;
    }

    public String getLugar_Asamblea() {
        return lugar_Asamblea;
    }

    public void setLugar_Asamblea(String lugar_Asamblea) {
        this.lugar_Asamblea = lugar_Asamblea;
    }

    public Date getFecha_Asamblea() {
        return fecha_Asamblea;
    }

    public void setFecha_Asamblea(Date fecha_Asamblea) {
        this.fecha_Asamblea = fecha_Asamblea;
    }

    public Timestamp getHora_inicio_Asamblea() {
        return hora_inicio_Asamblea;
    }

    public void setHora_inicio_Asamblea(Timestamp hora_inicio_Asamblea) {
        this.hora_inicio_Asamblea = hora_inicio_Asamblea;
    }

    public Timestamp getHora_fin_Asamblea() {
        return hora_fin_Asamblea;
    }

    public void setHora_fin_Asamblea(Timestamp hora_fin_Asamblea) {
        this.hora_fin_Asamblea = hora_fin_Asamblea;
    }

    public String getDescripcion_Asamblea() {
        return descripcion_Asamblea;
    }

    public void setDescripcion_Asamblea(String descripcion_Asamblea) {
        this.descripcion_Asamblea = descripcion_Asamblea;
    }

    public int getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(int id_Evento) {
        this.id_Evento = id_Evento;
    }
}