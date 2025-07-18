package utez.integradoraglobacta.Contollers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VistaPrincipalController {

    // Botón para agregar
    @FXML
    private Button btnAgregar;

    // Tarjeta principal
    @FXML
    private Pane tarjetaPrincipal;
    @FXML
    private Label lblNombrePrincipal;
    @FXML
    private Label lblDescripcionPrincipal;
    @FXML
    private ImageView imgPrincipal;

    // Tarjeta mini 1
    @FXML
    private Pane tarjetaMini1;
    @FXML
    private Label lblNombreMini1;
    @FXML
    private Label lblDescripcionMini1;
    @FXML
    private ImageView imgMini1;

    // Tarjeta mini 2
    @FXML
    private Pane tarjetaMini2;
    @FXML
    private Label lblNombreMini2;
    @FXML
    private Label lblDescripcionMini2;
    @FXML
    private ImageView imgMini2;

    @FXML
    private AnchorPane root;




    @FXML
    private void initialize( ) {
        System.out.println("VistaPrincipal inicializada");


    }

    @FXML
    private void seleccionarEvento( MouseEvent event) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/Nombre_Evento.fxml"));
                Parent vistaDetalle = loader.load();
                Pane pane = (Pane) event.getSource();
                Stage stage = (Stage) pane.getScene().getWindow();
                stage.setScene(new Scene(vistaDetalle));
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
            }

    }

    @FXML
    private void onAgregarEvento() {
        System.out.println("Botón Agregar presionado");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/crear evento.fxml"));
            Parent crearEvento = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(crearEvento));
            stage.setTitle("Editar evento");
            stage.showAndWait();
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    public void setDatosPrincipal(String nombre, String descripcion) {
        lblNombrePrincipal.setText(nombre);
        lblDescripcionPrincipal.setText(descripcion);
    }

    public void setDatosMini1(String nombre, String descripcion) {
        lblNombreMini1.setText(nombre);
        lblDescripcionMini1.setText(descripcion);
    }

    public void setDatosMini2(String nombre, String descripcion) {
        lblNombreMini2.setText(nombre);
        lblDescripcionMini2.setText(descripcion);
    }


}
