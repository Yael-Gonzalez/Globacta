package com.example.evento;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

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
    private void initialize() {
        // Aquí puedes inicializar los datos si necesitas
        System.out.println("Pantalla DetalleEvento inicializada");
    }

    @FXML
    private void onEditarEvento() {
        // Lógica cuando se presiona el botón "Editar evento"
        System.out.println("Editar evento presionado");
        // Aquí puedes cargar otra vista o abrir un formulario de edición
    }

    @FXML
    private void onVerAsambleas() {
        // Lógica cuando se presiona "Ver Asambleas Disponibles"
        System.out.println("Ver asambleas disponibles presionado");
        // Aquí puedes cargar una lista de asambleas u otra vista
    }

    @FXML
    private void onBackButtonClick() {
        // Lógica para volver a la pantalla anterior
        System.out.println("Botón de regresar presionado");
        // Aquí puedes cerrar esta ventana o cambiar de escena
    }
}
