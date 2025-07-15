package com.example.evento;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class EditarAsamblea {

    // Campos de texto
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtParticipantes;

    @FXML
    private TextField txtHoraInicio;

    @FXML
    private TextField txtLugar;

    @FXML
    private TextField txtHoraFinal;

    // Botones
    @FXML
    private Button btnEditarParticipantes;

    @FXML
    private Button backButton;

    // Label de flecha (opcional si lo necesitas)
    @FXML
    private Label lblBackArrow;

    @FXML
    private void initialize() {
        // Aquí puedes cargar datos iniciales si quieres
        System.out.println("Pantalla EditarAsamblea inicializada.");
    }

    @FXML
    private void onEditarParticipantes() {
        // Aquí va la lógica para guardar/editar los datos
        String nombre = txtNombre.getText();
        String fecha = txtFecha.getText();
        String participantes = txtParticipantes.getText();
        String horaInicio = txtHoraInicio.getText();
        String lugar = txtLugar.getText();
        String horaFinal = txtHoraFinal.getText();

        // Por ahora imprime en consola
        System.out.println("=== Datos de la asamblea editados ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Participantes: " + participantes);
        System.out.println("Hora Inicio: " + horaInicio);
        System.out.println("Lugar: " + lugar);
        System.out.println("Hora Final: " + horaFinal);
    }

    @FXML
    private void onBackButtonClick() {
        // Lógica para volver a la ventana anterior
        System.out.println("Botón de regreso presionado");
        // Aquí puedes cerrar la escena o cargar otra vista
    }
}
