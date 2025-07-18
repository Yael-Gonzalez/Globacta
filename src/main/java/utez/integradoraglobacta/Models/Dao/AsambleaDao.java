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
          hola:)



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
