package utez.integradoraglobacta.Contollers;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Inicio {
    @FXML
    private AnchorPane root;

    public void initialize() {
        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event -> cambiarAVistaPrincipal());
        delay.play();


    }
    private void cambiarAVistaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/VistaPrincipal.fxml"));
            Parent vistaPrincipal = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(vistaPrincipal));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
