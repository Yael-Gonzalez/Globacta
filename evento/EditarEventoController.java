package com.example.evento;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditarEventoController {

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
    private Button btnImagen;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnBack;

    @FXML
    private void initialize() {
        System.out.println("Pantalla EditarEvento inicializada");
    }

    @FXML
    private void onInsertarImagen() {
        System.out.println("Insertar nueva imagen presionado");
        // Aquí puedes abrir un FileChooser para seleccionar una imagen
    }

    @FXML
    private void onEliminar() {
        System.out.println("Eliminar evento presionado");
        // Aquí puedes agregar la lógica para eliminar el evento
    }

    @FXML
    private void onAceptar() {
        // Obtiene valores de los campos
        String nombre = txtNombre.getText();
        String lugar = txtLugar.getText();
        String fechaInicio = txtFechaInicio.getText();
        String fechaFin = txtFechaFin.getText();
        String descripcion = txtDescripcion.getText();

        System.out.println("Aceptar presionado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Lugar: " + lugar);
        System.out.println("Fecha Inicio: " + fechaInicio);
        System.out.println("Fecha Fin: " + fechaFin);
        System.out.println("Descripción: " + descripcion);

        // Aquí implementas la lógica para actualizar los datos
    }

    @FXML
    private void onBack() {
        System.out.println("Volver presionado");
        // Aquí puedes cerrar la ventana o volver a la pantalla anterior
    }
}
