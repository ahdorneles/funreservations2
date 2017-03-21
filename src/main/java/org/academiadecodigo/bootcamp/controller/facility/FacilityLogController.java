package org.academiadecodigo.bootcamp.controller.facility;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;

public class FacilityLogController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="fundao"
    private ImageView fundao; // Value injected by FXMLLoader

    @FXML // fx:id="logIn"
    private Button logIn; // Value injected by FXMLLoader

    @FXML // fx:id="back"
    private Hyperlink back; // Value injected by FXMLLoader

    @FXML
    void buttonHandler(ActionEvent event) {

    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert fundao != null : "fx:id=\"fundao\" was not injected: check your FXML file 'facility_log.fxml'.";
        assert logIn != null : "fx:id=\"logIn\" was not injected: check your FXML file 'facility_log.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'facility_log.fxml'.";

    }
}


