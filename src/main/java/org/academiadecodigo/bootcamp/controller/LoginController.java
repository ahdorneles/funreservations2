package org.academiadecodigo.bootcamp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

/**
 * Created by codecadet on 20/03/17.
 */

public class LoginController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="fundao"
    private ImageView fundao; // Value injected by FXMLLoader

    @FXML // fx:id="logIn"
    private Button logIn; // Value injected by FXMLLoader

    @FXML // fx:id="register"
    private Hyperlink register; // Value injected by FXMLLoader

    @FXML
    void buttonHandler(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert fundao != null : "fx:id=\"fundao\" was not injected: check your FXML file 'login_view.fxml'.";
        assert logIn != null : "fx:id=\"logIn\" was not injected: check your FXML file 'login_view.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'login_view.fxml'.";

    }
}

