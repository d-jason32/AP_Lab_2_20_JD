package edu.farmingdale.ap_lab_2_20_jd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    void moveToNewScreen(MouseEvent event) throws IOException {
        Scene scene = ((ImageView)event.getSource()).getScene();
        FXMLLoader landingScene = new FXMLLoader(HelloApplication.class.getResource("landing_screen.fxml"));

        scene.setRoot(landingScene.load());

    }

    @FXML
    private Button loginButton;

    @FXML
    void goToLoginPage(ActionEvent event) throws IOException {
        Scene scene = ((ImageView)event.getSource()).getScene();
        FXMLLoader loginScene = new FXMLLoader(HelloApplication.class.getResource("login_screen.fxml"));

        scene.setRoot(loginScene.load());

    }


}