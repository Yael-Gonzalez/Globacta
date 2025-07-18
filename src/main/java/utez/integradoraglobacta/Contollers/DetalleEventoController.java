package utez.integradoraglobacta.Contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DetalleEventoController {

    @FXML
    private Label lblDescripcion;

    @FXML
    private Label lblLugar;

    @FXML
    private Label lblFechaInicio;

    @FXML
    private Label lblFechaFin;

    @FXML
    private ImageView imgEvento;

    @FXML
    private Button btnEditarEvento;

    @FXML
    private Button btnVerAsambleas;

    @FXML
    private Button btnBack;
    @FXML
    private AnchorPane root;

    @FXML
    private void initialize() {
        // Aquí puedes inicializar los datos si necesitas
        System.out.println("Pantalla DetalleEvento inicializada");
    }

    @FXML
    private void onEditarEvento(ActionEvent event) {
        // Lógica cuando se presiona el botón "Editar evento"
        System.out.println("Editar evento presionado");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/EditarEvento.fxml"));
            Parent root = (Parent) loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
        // Aquí puedes cargar otra vista o abrir un formulario de edición
    }

    @FXML
    private void onVerAsambleas() {
        // Lógica cuando se presiona "Ver Asambleas Disponibles"
        System.out.println("Ver asambleas disponibles presionado");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/Asambleas.fxml"));
            Parent asambleas = (Parent) loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(asambleas));
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
        // Aquí puedes cargar una lista de asambleas u otra vista
    }

    @FXML
    private void onBackButtonClick() {
        // Lógica para volver a la pantalla anterior
        System.out.println("Botón de regresar presionado");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/VistaPrincipal.fxml"));
            Parent InicioEvento = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(InicioEvento));
            stage.showAndWait();
        }catch (Exception e){
            e.printStackTrace();
        }
        // Aquí puedes cerrar esta ventana o cambiar de escena
    }
}
