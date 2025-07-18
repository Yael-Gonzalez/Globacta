package utez.integradoraglobacta.Contollers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class CrearAsambleaController {

    @FXML
    private TextField nombreField;

    @FXML
    private TextField participantesField;

    @FXML
    private TextField lugarField;

    @FXML
    private DatePicker fechaPicker;

    @FXML
    private TextField horaInicioField;

    @FXML
    private TextField horaFinField;

    @FXML
    private Button importarArchivoBtn;

    @FXML
    private Button crearAsambleaBtn;

    @FXML
    private AnchorPane root;

    public void regresar(ActionEvent actionEvent) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/Asambleas.fxml"));
        Parent asambleas = (Parent) loader.load();
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(asambleas));
        stage.show();
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    public void crearAsamblea(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/Asambleas.fxml"));
            Parent asambleas = (Parent) loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(asambleas));
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void importar(ActionEvent actionEvent) {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Seleccionar archivo Excel");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Archivos", "*.xls", "*.xlsx", "*.xlsm")
            );
            File archivoSeleccionado = fileChooser.showOpenDialog(((Node) actionEvent.getSource()).getScene().getWindow());
            if (archivoSeleccionado != null) {
                System.out.println("Archivo seleccionado: " + archivoSeleccionado.getAbsolutePath());
            } else {
                System.out.println("Ningun archivo seleccionado");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
