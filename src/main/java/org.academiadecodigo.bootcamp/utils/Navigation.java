package org.academiadecodigo.bootcamp.utils;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by codecadet on 08/03/2017.
 */
public final class Navigation {

    private final int MIN_WIDTH = 628; // window width
    private final int MIN_HEIGHT = 400; // window height
    private LinkedList<Scene> scenes = new LinkedList<>(); // Navigation History
    private Map<String, Initializable> controllers = new HashMap<>(); //Container of controllers
    private Stage stage;
    private static Navigation instance = null;
    private final String VIEW_PATH = "view";

    private Navigation() {

    }

    public static synchronized Navigation getInstance() {

        if (instance == null) {
            instance = new Navigation();
        }
        return instance;
    }

    public void loadScreen(String view) {
        try {

            // Instantiate the view and the controller
            FXMLLoader fxmlLoader;
            fxmlLoader = new FXMLLoader(getClass().getResource(VIEW_PATH + "/" + view + ".fxml"));
            Parent root = fxmlLoader.load();

            //Store the controller
            controllers.put(view, fxmlLoader.<Initializable>getController());


            // Create a new scene and add it to the stack
            Scene scene = new Scene(root, MIN_WIDTH, MIN_HEIGHT);
            scenes.push(scene);

            // Put the scene on the stage
            setScene(scene);

        } catch (IOException e) {
            System.out.println("Failure to load view " + view + " : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void back() {
        if (scenes.isEmpty()) {
            return;
        }

        scenes.pop();

        setScene(scenes.peek());
    }

    private void setScene(Scene scene) {
        stage.setScene(scene);
        stage.show();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Initializable getController(String view) {
        return controllers.get(view);
    }
}


