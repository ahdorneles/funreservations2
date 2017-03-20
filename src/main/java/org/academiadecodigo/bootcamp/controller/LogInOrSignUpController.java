package org.academiadecodigo.bootcamp.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * Created by codecadet on 20/03/17.
 */
public class LogInOrSignUpController {


    @FXML // fx:id="fundaoImage"
    private ImageView fundao; // Value injected by FXMLLoader

    @FXML // fx:id="logInButton"
    private Button logInButton; // Value injected by FXMLLoader

    @FXML // fx:id="signUpButton"
    private Button signUpButton; // Value injected by FXMLLoader

    @FXML // fx:id="label"
    private Label label; // Value injected by FXMLLoader

    @FXML
    void buttonHandler(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert fundao != null : "fx:id=\"fundaoImage\" was not injected: check your FXML file 'logIn_or_signUp_view.fxml'.";
        assert logInButton != null : "fx:id=\"logInButton\" was not injected: check your FXML file 'logIn_or_signUp_view.fxml'.";
        assert signUpButton != null : "fx:id=\"signUpButton\" was not injected: check your FXML file 'logIn_or_signUp_view.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'logIn_or_signUp_view.fxml'.";

    }
}
