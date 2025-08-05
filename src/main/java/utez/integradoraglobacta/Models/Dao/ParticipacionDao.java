package utez.integradoraglobacta.Models.Dao;

import utez.integradoraglobacta.Models.Participacion;
import utez.integradoraglobacta.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ParticipacionDao {

    public boolean CrearParticipacion(Participacion participacion) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "INSERT INTO participacion (id_estudiante, id_asamblea, id_evento) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, participacion.getId_Estudiante());
            ps.setInt(2, participacion.getId_Asamblea());
            ps.setInt(3, participacion.getId_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean EliminarParticipacion(Participacion participacion) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "DELETE FROM participacion WHERE id_estudiante = ? AND id_asamblea = ? AND id_evento = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, participacion.getId_Estudiante());
            ps.setInt(2, participacion.getId_Asamblea());
            ps.setInt(3, participacion.getId_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateParticipacion(Participacion participacion, Participacion nuevaParticipacion) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "UPDATE participacion SET id_estudiante = ?, id_asamblea = ?, id_evento = ? WHERE id_estudiante = ? AND id_asamblea = ? AND id_evento = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, nuevaParticipacion.getId_Estudiante());
            ps.setInt(2, nuevaParticipacion.getId_Asamblea());
            ps.setInt(3, nuevaParticipacion.getId_Evento());
            ps.setInt(4, participacion.getId_Estudiante());
            ps.setInt(5, participacion.getId_Asamblea());
            ps.setInt(6, participacion.getId_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Participacion> LeerParticipaciones() {
        List<Participacion> participaciones = new ArrayList<>();

        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "SELECT * FROM participacion";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Participacion p = new Participacion();
                p.setId_Estudiante(rs.getInt("id_estudiante"));
                p.setId_Asamblea(rs.getInt("id_asamblea"));
                p.setId_Evento(rs.getInt("id_evento"));

                participaciones.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return participaciones;
    }
}