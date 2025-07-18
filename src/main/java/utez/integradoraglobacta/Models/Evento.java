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
