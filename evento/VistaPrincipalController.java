package com.example.evento;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class VistaPrincipalController {

    // Botón para agregar
    @FXML
    private Button btnAgregar;

    // Tarjeta principal
    @FXML
    private Label lblNombrePrincipal;
    @FXML
    private Label lblDescripcionPrincipal;
    @FXML
    private ImageView imgPrincipal;

    // Tarjeta mini 1
    @FXML
    private Label lblNombreMini1;
    @FXML
    private Label lblDescripcionMini1;
    @FXML
    private ImageView imgMini1;

    // Tarjeta mini 2
    @FXML
    private Label lblNombreMini2;
    @FXML
    private Label lblDescripcionMini2;
    @FXML
    private ImageView imgMini2;

    @FXML
    private void initialize() {
        System.out.println("VistaPrincipal inicializada");
        // Aquí puedes inicializar los datos de las tarjetas desde tu modelo o BD
    }

    @FXML
    private void onAgregarEvento() {
        System.out.println("Botón Agregar presionado");
        // Aquí puedes abrir la vista para crear un nuevo evento
        // Por ejemplo, cambiar de escena o mostrar un modal
    }

    // Puedes agregar métodos para actualizar la información de las tarjetas
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
