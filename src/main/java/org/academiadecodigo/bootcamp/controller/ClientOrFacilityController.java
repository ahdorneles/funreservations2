package org.academiadecodigo.bootcamp.controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * Created by codecadet on 20/03/17.
 */

public class ClientOrFacilityController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="fundao"
    private ImageView fundao; // Value injected by FXMLLoader

    @FXML // fx:id="clientButton"
    private Button clientButton; // Value injected by FXMLLoader

    @FXML // fx:id="facilityButton"
    private Button facilityButton; // Value injected by FXMLLoader

    @FXML // fx:id="label"
    private Label label; // Value injected by FXMLLoader

    @FXML
    void buttonHandler(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert fundao != null : "fx:id=\"fundaoImage\" was not injected: check your FXML file 'client_or_facility_view.fxml'.";
        assert clientButton != null : "fx:id=\"clientButton\" was not injected: check your FXML file 'client_or_facility_view.fxml'.";
        assert facilityButton != null : "fx:id=\"facilityButton\" was not injected: check your FXML file 'client_or_facility_view.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'client_or_facility_view.fxml'.";

    }
}

