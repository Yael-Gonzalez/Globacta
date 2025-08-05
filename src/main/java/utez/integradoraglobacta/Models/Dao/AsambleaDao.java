/*
package utez.integradoraglobacta.Models.Dao;

import oracle.ucp.jdbc.PoolDataSource;
import utez.integradoraglobacta.Models.Asamblea;
import utez.integradoraglobacta.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AsambleaDao {

  public boolean CrearAsamblea(Asamblea asamblea){
      try {
          Connection conn = new DataBaseConnection().getConnection();
          String query = "SELECT * FROM Asamblea (id_asamblea,nombre_asamblea,lugar_asamblea,fecha_asamblea,hora_inicio,hora_fin) Values (?,?,?,?,?,?)";
          PreparedStatement ps = conn.prepareStatement(query);
          ps.setInt(1,asamblea.getId_Asamblea());
          ps.setString(2,asamblea.getNombre_Asamblea());
          ps.setString(3,asamblea.getLugar_Asamblea());
          ps.setDate(4,java.sql.Date.valueOf(asamblea.getFecha_Asamblea()));
          ps.setTimestamp(5,asamblea.getHora_inicio_Asamblea());




      }catch (Exception e){
          e.printStackTrace();
      }


      return false;
  }

  public boolean EliminarAsamblea(Asamblea asamblea){


      return false;
  }

  public boolean UpdateAsamblea(Asamblea asamblea){

      return false;
  }


  List<Asamblea> LeerAsamblea(){
      List<Asamblea> asambleas = new ArrayList<>();

      return asambleas;
  }


}
*/
package utez.integradoraglobacta.Models.Dao;

import utez.integradoraglobacta.Models.Asamblea;
import utez.integradoraglobacta.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AsambleaDao {

    public boolean CrearAsamblea(Asamblea asamblea) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "INSERT INTO asamblea (id_asamblea, nombre_asamblea, lugar_asamblea, fecha_asamblea, hora_inicio, hora_fin, descripcion_asamblea, id_evento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, asamblea.getId_Asamblea());
            ps.setString(2, asamblea.getNombre_Asamblea());
            ps.setString(3, asamblea.getLugar_Asamblea());
            ps.setDate(4, asamblea.getFecha_Asamblea());
            ps.setTimestamp(5, asamblea.getHora_inicio_Asamblea());
            ps.setTimestamp(6, asamblea.getHora_fin_Asamblea());
            ps.setString(7, asamblea.getDescripcion_Asamblea());
            ps.setInt(8, asamblea.getId_Evento());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean EliminarAsamblea(Asamblea asamblea) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "DELETE FROM asamblea WHERE id_asamblea = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, asamblea.getId_Asamblea());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpdateAsamblea(Asamblea asamblea) {
        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "UPDATE asamblea SET nombre_asamblea = ?, lugar_asamblea = ?, fecha_asamblea = ?, hora_inicio = ?, hora_fin = ?, descripcion_asamblea = ?, id_evento = ? WHERE id_asamblea = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, asamblea.getNombre_Asamblea());
            ps.setString(2, asamblea.getLugar_Asamblea());
            ps.setDate(3, asamblea.getFecha_Asamblea());
            ps.setTimestamp(4, asamblea.getHora_inicio_Asamblea());
            ps.setTimestamp(5, asamblea.getHora_fin_Asamblea());
            ps.setString(6, asamblea.getDescripcion_Asamblea());
            ps.setInt(7, asamblea.getId_Evento());
            ps.setInt(8, asamblea.getId_Asamblea());

            int result = ps.executeUpdate();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Asamblea> LeerAsamblea() {
        List<Asamblea> asambleas = new ArrayList<>();

        try {
            Connection conn = new DataBaseConnection().getConnection();
            String query = "SELECT * FROM asamblea";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Asamblea asamblea = new Asamblea();
                asamblea.setId_Asamblea(rs.getInt("id_asamblea"));
                asamblea.setNombre_Asamblea(rs.getString("nombre_asamblea"));
                asamblea.setLugar_Asamblea(rs.getString("lugar_asamblea"));
                asamblea.setFecha_Asamblea(rs.getDate("fecha_asamblea"));
                asamblea.setHora_inicio_Asamblea(rs.getTimestamp("hora_inicio"));
                asamblea.setHora_fin_Asamblea(rs.getTimestamp("hora_fin"));
                asamblea.setDescripcion_Asamblea(rs.getString("descripcion_asamblea"));
                asamblea.setId_Evento(rs.getInt("id_evento"));

                asambleas.add(asamblea);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return asambleas;
    }
}