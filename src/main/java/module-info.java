module utez.integradoraglobacta {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires ucp;


    opens utez.integradoraglobacta to javafx.fxml;
    exports utez.integradoraglobacta;

    opens utez.integradoraglobacta.utils to javafx.fxml;
    exports utez.integradoraglobacta.utils;

    opens utez.integradoraglobacta.Contollers to javafx.fxml;
    exports utez.integradoraglobacta.Contollers;

    opens  utez.integradoraglobacta.Models to javafx.fxml;
    exports utez.integradoraglobacta.Models;



}