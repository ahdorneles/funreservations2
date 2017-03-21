/**
 * Sample Skeleton for 'client_reservation.fxml' Controller Class
 */

package org.academiadecodigo.bootcamp.controller.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class ClientReservationController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="fundao"
    private ImageView fundao; // Value injected by FXMLLoader

    @FXML // fx:id="make_reserv"
    private Button make_reserv; // Value injected by FXMLLoader

    @FXML // fx:id="manage_reserv"
    private Button manage_reserv; // Value injected by FXMLLoader

    @FXML
    void buttonHandler(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert fundao != null : "fx:id=\"fundao\" was not injected: check your FXML file 'client_reservation.fxml'.";
        assert make_reserv != null : "fx:id=\"make_reserv\" was not injected: check your FXML file 'client_reservation.fxml'.";
        assert manage_reserv != null : "fx:id=\"manage_reserv\" was not injected: check your FXML file 'client_reservation.fxml'.";

    }
}