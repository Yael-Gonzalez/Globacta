package com.example.evento;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    private void initialize() {
        System.out.println("Pantalla Evento inicializada");
    }

    @FXML
    private void onImportarImagen() {
        System.out.println("Botón 'Insertar imagen' presionado");
        // Aquí puedes usar FileChooser para seleccionar una imagen y cargarla
    }

    @FXML
    private void onCrearEvento() {
        // Recoge datos de los campos
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

        // Aquí puedes guardar la información o enviarla a tu base de datos
    }

    @FXML
    private void onBack() {
        System.out.println("Volver presionado");
        // Aquí puedes cerrar esta ventana o regresar a la anterior
    }
}
