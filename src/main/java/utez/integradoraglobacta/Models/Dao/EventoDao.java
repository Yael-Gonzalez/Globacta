package utez.integradoraglobacta.Models.Dao;

import utez.integradoraglobacta.Models.Evento;
import utez.integradoraglobacta.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EventoDao {

    public boolean CrearEvento(Evento evento) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "INSERT INTO evento (id_evento, nombre_evento, fecha_inicio_evento, fecha_fin_evento, lugar_evento, descripcion_evento, imagen_evento) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, evento.getId_Evento());
            ps.setString(2, evento.getNombre_Evento());
            ps.setDate(3, Date.valueOf(evento.getFecha_Inicio_Evento()));
            ps.setDate(4, Date.valueOf(evento.getFecha_Fin_Evento()));
            ps.setString(5, evento.getLugar_Evento());
            ps.setString(6, evento.getDescripcion_Evento());
            ps.setBytes(7, evento.getImagen_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean EliminarEvento(Evento evento) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "DELETE FROM evento WHERE id_evento = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, evento.getId_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateEvento(Evento evento) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "UPDATE evento SET nombre_evento = ?, fecha_inicio_evento = ?, fecha_fin_evento = ?, lugar_evento = ?, descripcion_evento = ?, imagen_evento = ? WHERE id_evento = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, evento.getNombre_Evento());
            ps.setDate(2, Date.valueOf(evento.getFecha_Inicio_Evento()));
            ps.setDate(3, Date.valueOf(evento.getFecha_Fin_Evento()));
            ps.setString(4, evento.getLugar_Evento());
            ps.setString(5, evento.getDescripcion_Evento());
            ps.setBytes(6, evento.getImagen_Evento());
            ps.setInt(7, evento.getId_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Evento> LeerEventos() {
        List<Evento> eventos = new ArrayList<>();

        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "SELECT * FROM evento";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setId_Evento(rs.getInt("id_evento"));
                evento.setNombre_Evento(rs.getString("nombre_evento"));
                evento.setFecha_Inicio_Evento(rs.getDate("fecha_inicio_evento").toLocalDate());
                evento.setFecha_Fin_Evento(rs.getDate("fecha_fin_evento").toLocalDate());
                evento.setLugar_Evento(rs.getString("lugar_evento"));
                evento.setDescripcion_Evento(rs.getString("descripcion_evento"));
                evento.setImagen_Evento(rs.getBytes("imagen_evento"));

                eventos.add(evento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return eventos;
    }
}