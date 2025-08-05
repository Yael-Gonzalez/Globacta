package utez.integradoraglobacta.Models.Dao;
import utez.integradoraglobacta.Models.Institucion;
import utez.integradoraglobacta.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class InstitucionDao {

        public boolean CrearInstitucion(Institucion institucion){
            try {
                Connection conn = new DataBaseConnection().getConnection();
                String query = "INSERT INTO institucion (id_institucion, nombre_institucion) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, institucion.getId_Institucion());
                ps.setString(2, institucion.getNombre_Institucion());

                int result = ps.executeUpdate();
                return result > 0;

            } catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }

        public boolean EliminarInstitucion(Institucion institucion){
            try {
                Connection conn = new DataBaseConnection().getConnection();
                String query = "DELETE FROM institucion WHERE id_institucion = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, institucion.getId_Institucion());

                int result = ps.executeUpdate();
                return result > 0;

            } catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }

        public boolean UpdateInstitucion(Institucion institucion){
            try {
                Connection conn = new DataBaseConnection().getConnection();
                String query = "UPDATE institucion SET nombre_institucion = ? WHERE id_institucion = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, institucion.getNombre_Institucion());
                ps.setString(2, institucion.getId_Institucion());

                int result = ps.executeUpdate();
                return result > 0;

            } catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }

        public List<Institucion> LeerInstituciones(){
            List<Institucion> instituciones = new ArrayList<>();
            try {
                Connection conn = new DataBaseConnection().getConnection();
                String query = "SELECT * FROM institucion";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                while (rs.next()){
                    Institucion inst = new Institucion();
                    inst.setId_Institucion(rs.getString("id_institucion"));
                    inst.setNombre_Institucion(rs.getString("nombre_institucion"));
                    instituciones.add(inst);
                }

            } catch (Exception e){
                e.printStackTrace();
            }

            return instituciones;
        }
    }

