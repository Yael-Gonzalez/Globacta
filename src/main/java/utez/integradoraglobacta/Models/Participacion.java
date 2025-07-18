package utez.integradoraglobacta.Models;

public class Participacion {
    private int id_Estudiante;
    private int id_Asamblea;
    private int id_Evento;

    public Participacion() {
    }

    public Participacion(int id_Estudiante, int id_Asamblea, int id_Evento) {
        this.id_Estudiante = id_Estudiante;
        this.id_Asamblea = id_Asamblea;
        this.id_Evento = id_Evento;
    }

    public int getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(int id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public int getId_Asamblea() {
        return id_Asamblea;
    }

    public void setId_Asamblea(int id_Asamblea) {
        this.id_Asamblea = id_Asamblea;
    }

    public int getId_Evento() {
        return id_Evento;
    }

    public void setId_Evento(int id_Evento) {
        this.id_Evento = id_Evento;
    }
}
