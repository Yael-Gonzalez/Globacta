package com.example.evento;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;

public class EventoController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtLugar;

    @FXML
    private DatePicker dpFechaInicio;

    @FXML
    private DatePicker dpFechaFin;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private Button btnImportarImagen;

    @FXML
    private ImageView imgEvento;

    @FXML
    private Button btnCrearEvento;

    private File imagenSeleccionada;

    @FXML
    private void initialize() {
        btnImportarImagen.setOnAction(e -> importarImagen());
        btnCrearEvento.setOnAction(e -> crearEvento());
    }

    private void importarImagen() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar imagen del evento");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Imágenes", "*.png", "*.jpg", "*.jpeg")
        );
        File archivo = fileChooser.showOpenDialog(null);
        if (archivo != null) {
            imagenSeleccionada = archivo;
            Image imagen = new Image(archivo.toURI().toString());
            imgEvento.setImage(imagen);
        }
    }

    private void crearEvento() {
        String nombre = txtNombre.getText();
        String lugar = txtLugar.getText();
        String fechaInicio = (dpFechaInicio.getValue() != null) ? dpFechaInicio.getValue().toString() : "";
        String fechaFin = (dpFechaFin.getValue() != null) ? dpFechaFin.getValue().toString() : "";
        String descripcion = txtDescripcion.getText();

        System.out.println("Nombre: " + nombre);
        System.out.println("Lugar: " + lugar);
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Término: " + fechaFin);
        System.out.println("Descripción: " + descripcion);

        if (imagenSeleccionada != null) {
            System.out.println("Imagen seleccionada: " + imagenSeleccionada.getAbsolutePath());
        } else {
            System.out.println("No se seleccionó ninguna imagen.");
        }
    }
}
