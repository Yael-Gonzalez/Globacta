package utez.integradoraglobacta.Contollers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AsambleasController {



    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnRegresar;

    @FXML
    private AnchorPane root;
    @FXML
    private void abrirFormulario(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/CrearAsambleas.fxml"));
            Parent Evento = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(Evento));
            stage.show();
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    @FXML
    private void regresar(ActionEvent event) {
        try {
            jijikhac
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
}
