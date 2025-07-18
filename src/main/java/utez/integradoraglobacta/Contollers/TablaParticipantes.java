package utez.integradoraglobacta.Contollers;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TablaParticipantes {

    @FXML
    private Button btnRegresar;

    @FXML
    private Label tituloPrincipal;

    @FXML
    private Label tituloSecundario;

    @FXML
    private TableView<?> tablaParticipantes;

    @FXML
    private TableColumn<?, ?> colNumero;

    @FXML
    private TableColumn<?, ?> colNombreEstudiante;

    @FXML
    private TableColumn<?, ?> colNombreEscuela;

    @FXML
    private TableColumn<?, ?> colClaveEscuela;

    @FXML
    private TableColumn<?, ?> colRol;

    @FXML
    private Label instruccion;

    // Aquí puedes agregar más lógica, por ejemplo, para manejar eventos.
}
