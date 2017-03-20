/*
package org.academiadecodigo.bootcamp.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.academiadecodigo.bootcamp.utils.Navigation;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.ServiceRegistry;
import org.academiadecodigo.bootcamp.service.user.UserService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

*/
/**
 * Created by codecadet on 07/03/2017.
 *//*

public class LoginController implements Initializable {

    String username;
    String password;
    String email;


    private boolean justRegistered = false;

    private UserService userService;

    @FXML
    private TextField textUserName;

    @FXML
    private TextField textEmail;

    @FXML
    private TextField textPassword;

    @FXML
    private Label emailAsk;

    @FXML
    private Button buttonLogin;

    @FXML
    private Hyperlink registerButton;

    @FXML
    private Label wrongPassword;

    @FXML
    private Button buttonRegisterAndLog;

    @FXML
    private Label userIsTaken;

    @FXML
    private Label welcome;
    @FXML
    private Label passwordField;

    @FXML
    private Label getRegistered;


    @FXML
    private Label userField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert textUserName != null : "fx:id=\"textUserName\" was not injected: check your FXML file 'login.fxml'.";
        assert textEmail != null : "fx:id=\"textEmail\" was not injected: check your FXML file 'login.fxml'.";
        assert textPassword != null : "fx:id=\"textPassword\" was not injected: check your FXML file 'login.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'login.fxml'.";
        assert userField != null : "fx:id=\"userField\" was not injected: check your FXML file 'login.fxml'.";
        assert emailAsk != null : "fx:id=\"emailAsk\" was not injected: check your FXML file 'login.fxml'.";
        assert wrongPassword != null : "fx:id=\"wrongPassword\" was not injected: check your FXML file 'login.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'login.fxml'.";
        assert registerButton != null : "fx:id=\"registerButton\" was not injected: check your FXML file 'login.fxml'.";
        assert buttonRegisterAndLog != null : "fx:id=\"buttonRegisterAndLog\" was not injected: check your FXML file 'login.fxml'.";
        assert getRegistered != null : "fx:id=\"getRegistered\" was not injected: check your FXML file 'login.fxml'.";
        assert userIsTaken != null : "fx:id=\"userIsTaken\" was not injected: check your FXML file 'login.fxml'.";

        userService = (UserService) ServiceRegistry.getInstance().getService("jdbc");
    }

    public void onLogin(ActionEvent actionEvent) throws SQLException {

        buttonRegisterAndLog = (Button) actionEvent.getSource();

        username = textUserName.getText();
        password = textPassword.getText();
        email = textEmail.getText();

        if (justRegistered) {
            if (userService.findByName(username) == null && !password.isEmpty() && !username.isEmpty()) {
                System.out.println("user not taken");
                newClient(username, password, email);
                secondScreen();


            } else if (userService.findByName(username) != null)
                System.out.println("User is taken");
                userIsTaken.setVisible(true);

        } else {

            if (userService.authenticate(username, password)) {
                secondScreen();

            } else {
                System.out.println("Wrong Password");
                wrongPassword.setVisible(true);
            }
        }

    }

    private void secondScreen() {
        textUserName.setVisible(true);
        textPassword.setVisible(true);
        userField.setVisible(true);
        passwordField.setVisible(true);
        buttonRegisterAndLog.setText("Login");
        textPassword.setText("");
        registerButton.setVisible(true);
        textEmail.setVisible(false);
        emailAsk.setVisible(false);
        wrongPassword.setVisible(false);
        welcome.setVisible(false);
        userIsTaken.setText("");
        Navigation.getInstance().loadScreen("logout");
    }

    private void newClient(String username, String password, String email) throws SQLException {
        User user = new User(username, password, email);
        userService.addUser(user);
        justRegistered = false;

    }


    public void onRegister(MouseEvent mouseEvent) {

        registerButton = (Hyperlink) mouseEvent.getSource();
        registerButton.setVisible(false);
        emailAsk.setVisible(true);
        textEmail.setVisible(true);
        buttonRegisterAndLog.setText("Register and Login!");
        justRegistered = true;
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
*/
