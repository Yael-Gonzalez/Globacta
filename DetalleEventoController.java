package com.example.evento;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class DetalleEventoController {

    @FXML private Label lblNombreEvento;
    @FXML private Label lblDescripcionTitulo;
    @FXML private Label lblDescripcionContenido;
    @FXML private Label lblLugar;
    @FXML private Label lblLugarInfo;
    @FXML private Label lblFechas;
    @FXML private Label lblFechasInfo;
    @FXML private ImageView imgEvento;

    @FXML private Button btnEditarEvento;
    @FXML private Button btnVerAsambleas;
    @FXML private Button btnVolver;

    @FXML
    public void initialize() {
        btnEditarEvento.setOnAction(event -> abrirVentana("editar_evento.fxml", "Editar Evento"));
        btnVerAsambleas.setOnAction(event -> abrirVentana("asambleas.fxml", "Asambleas Disponibles"));
        btnVolver.setOnAction(event -> cerrarVentanaActual());
    }

    private void abrirVentana(String fxmlPath, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/evento/" + fxmlPath));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cerrarVentanaActual() {
        Stage stage = (Stage) btnVolver.getScene().getWindow();
        stage.close();
    }
}
