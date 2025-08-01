package proyecto.redsocial.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import proyecto.redsocial.RedSocialApplication;
import proyecto.redsocial.model.Estudiante;
import proyecto.redsocial.utils.RedSocialUtils;

public class PagePerfilController {
    private Estudiante estudiante;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private HBox HBoxArchivo;

    @FXML
    private Button btnPublicar;

    @FXML
    private StackPane fotoPerfil;

    @FXML
    private Label labelArchivo;

    @FXML
    private Label nombreUsuario;

    @FXML
    private Label nombreUsuario1;

    @FXML
    private TextArea txtAreaTexto;

    @FXML
    void onPublicar(ActionEvent event) {
        abrirVentanaPublicacion();
    }

    @FXML
    void onSubirArchivo(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

    private void abrirVentanaPublicacion() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RedSocialApplication.class.getResource("/proyecto/redsocial/fxml/publicacion-view.fxml"));
            RedSocialUtils.CargaVentana(fxmlLoader,"Publicar");
            PublicacionController publicacionController = fxmlLoader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
