package utez.integradoraglobacta.Models.Dao;

import utez.integradoraglobacta.Models.Estudiante;
import utez.integradoraglobacta.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDao {

    public boolean CrearEstudiante(Estudiante estudiante) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "INSERT INTO estudiante (id_estudiante, nombre_estudiante, rol_estudiante, id_institucion, id_evento) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, estudiante.getId_Estudiante());
            ps.setString(2, estudiante.getNombre_Estudiante());
            ps.setString(3, estudiante.getRol_Estudiante());
            ps.setString(4, estudiante.getId_Institucion());
            ps.setInt(5, estudiante.getId_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Estudiante> LeerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();

        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "SELECT * FROM estudiante";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Estudiante e = new Estudiante();
                e.setId_Estudiante(rs.getInt("id_estudiante"));
                e.setNombre_Estudiante(rs.getString("nombre_estudiante"));
                e.setRol_Estudiante(rs.getString("rol_estudiante"));
                e.setId_Institucion(rs.getString("id_institucion"));
                e.setId_Evento(rs.getInt("id_evento"));

                estudiantes.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return estudiantes;
    }

    public boolean ActualizarEstudiante(Estudiante estudiante) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "UPDATE estudiante SET nombre_estudiante = ?, rol_estudiante = ?, id_institucion = ?, id_evento = ? WHERE id_estudiante = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, estudiante.getNombre_Estudiante());
            ps.setString(2, estudiante.getRol_Estudiante());
            ps.setString(3, estudiante.getId_Institucion());
            ps.setInt(4, estudiante.getId_Evento());
            ps.setInt(5, estudiante.getId_Estudiante());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean EliminarEstudiante(int idEstudiante) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "DELETE FROM estudiante WHERE id_estudiante = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idEstudiante);

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}