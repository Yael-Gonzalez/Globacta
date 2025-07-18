package utez.integradoraglobacta.Contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EditarEventoController {
    @FXML
    private AnchorPane root;
    public void regresar(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/Nombre_Evento.fxml"));
            Parent Evento = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(Evento));
            stage.showAndWait();
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void cancelar(ActionEvent event){

    }
    public void aceptar(ActionEvent event){

    }
}
