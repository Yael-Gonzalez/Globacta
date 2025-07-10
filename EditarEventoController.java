package com.example.evento;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;

public class EditarEventoController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtLugar;
    @FXML private TextField txtFechaInicio;
    @FXML private TextField txtFechaFin;
    @FXML private TextField txtDescripcion;
    @FXML private Button btnImagen;
    @FXML private ImageView imgPreview;
    @FXML private Button btnEliminar;
    @FXML private Button btnAceptar;

    private File imagenSeleccionada;

    @FXML
    public void initialize() {
        btnImagen.setOnAction(e -> seleccionarImagen());
        btnAceptar.setOnAction(e -> aceptarCambios());
        btnEliminar.setOnAction(e -> eliminarEvento());
    }

    private void seleccionarImagen() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecciona una nueva imagen");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Imágenes", "*.jpg", "*.jpeg", "*.png")
        );

        File archivo = fileChooser.showOpenDialog(null);
        if (archivo != null) {
            imagenSeleccionada = archivo;
            Image imagen = new Image(archivo.toURI().toString());
            imgPreview.setImage(imagen);
        }
    }

    private void aceptarCambios() {
        String nombre = txtNombre.getText();
        String lugar = txtLugar.getText();
        String fechaInicio = txtFechaInicio.getText();
        String fechaFin = txtFechaFin.getText();
        String descripcion = txtDescripcion.getText();

        // Aquí puedes guardar o actualizar el evento
        System.out.println("Actualizando evento:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Lugar: " + lugar);
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Imagen: " + (imagenSeleccionada != null ? imagenSeleccionada.getAbsolutePath() : "No cambiada"));

        mostrarAlerta("Evento actualizado", "Los cambios se han guardado correctamente.");
    }

    private void eliminarEvento() {
        // Lógica de eliminación
        System.out.println("Evento eliminado");
        mostrarAlerta("Evento eliminado", "El evento ha sido eliminado correctamente.");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
