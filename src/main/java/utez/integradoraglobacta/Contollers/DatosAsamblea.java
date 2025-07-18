package utez.integradoraglobacta.Contollers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DatosAsamblea {

    @FXML
    private TextField nombreAsambleaField;

    @FXML
    private DatePicker fechaAsambleaPicker;

    @FXML
    private TextField participantesField;

    @FXML
    private TextField horaInicioField;

    @FXML
    private TextField lugarField;

    @FXML
    private TextField horaFinField;

    @FXML
    private Button editarButton;

    @FXML
    private Button backButton;

    @FXML
    private void initialize() {
        // Se ejecuta al cargar la vista
        System.out.println("Pantalla DatosAsamblea inicializada");
    }

    @FXML
    private void onConfirmar() {
        // Captura de datos
        String nombre = nombreAsambleaField.getText();
        String fecha = (fechaAsambleaPicker.getValue() != null)
                ? fechaAsambleaPicker.getValue().toString()
                : "";
        String participantes = participantesField.getText();
        String horaInicio = horaInicioField.getText();
        String lugar = lugarField.getText();
        String horaFin = horaFinField.getText();

        // Aquí va tu lógica para procesar/guardar los datos
        System.out.println("=== Datos de la asamblea ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Participantes: " + participantes);
        System.out.println("Hora inicio: " + horaInicio);
        System.out.println("Lugar: " + lugar);
        System.out.println("Hora fin: " + horaFin);
    }

    @FXML
    private void onBackButtonClick() {
        // Aquí va la lógica para regresar a la pantalla anterior
        System.out.println("Botón de regresar presionado");
        // Puedes cerrar la ventana actual o cargar otra escena
    }
}
