package utez.integradoraglobacta.Contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class EventoController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtLugar;

    @FXML
    private TextField txtFechaInicio;

    @FXML
    private TextField txtFechaFin;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private Button btnImportarImagen;

    @FXML
    private Button btnCrearEvento;

    @FXML
    private Button btnBack;

    @FXML
    private AnchorPane root;

    @FXML
    private void initialize() {
        System.out.println("Pantalla Evento inicializada");
    }

    @FXML
    private void onImportarImagen(ActionEvent event) {
        try {
            System.out.println("Botón 'Insertar imagen' presionado");
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Seleccionar tu imagen");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Archivos", "*.jpg", "*.png")
            );
            File archivoSeleccionado = fileChooser.showOpenDialog(((Node) event.getSource()).getScene().getWindow());
            if (archivoSeleccionado != null) {
                System.out.println("Imgen seleccionada " + archivoSeleccionado.getAbsolutePath());
            } else {
                System.out.println("Ninguna imagen seleccionada");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        // Aquí puedes usar FileChooser para seleccionar una imagen y cargarla
    }

    @FXML
    private void onCrearEvento() {
        // Recoge datos de los campos
        try {
            String nombre = txtNombre.getText();
            String lugar = txtLugar.getText();
            String inicio = txtFechaInicio.getText();
            String fin = txtFechaFin.getText();
            String descripcion = txtDescripcion.getText();

            System.out.println("Crear Evento presionado");
            System.out.println("Nombre: " + nombre);
            System.out.println("Lugar: " + lugar);
            System.out.println("Inicio: " + inicio);
            System.out.println("Fin: " + fin);
            System.out.println("Descripción: " + descripcion);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/VistaPrincipal.fxml"));
            Parent InicioEvento = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(InicioEvento));
            stage.showAndWait();
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

        // Aquí puedes guardar la información o enviarla a tu base de datos
    }

    @FXML
    private void onBack() {
        System.out.println("Volvio a la vista principal");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/integradoraglobacta/VistaPrincipal.fxml"));
            Parent InicioEvento = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(InicioEvento));
            stage.showAndWait();
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
        // Aquí puedes cerrar esta ventana o regresar a la anterior
    }
}
