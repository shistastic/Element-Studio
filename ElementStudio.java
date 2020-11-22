/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementstudio;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.sql.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author juaniamaro
 */
public class ElementStudio extends Application{

    @Override
    public void start(Stage window) throws Exception{
        Parent elementStudio = FXMLLoader.load(getClass().getResource("ElementStudio.fxml"));
        Scene scene = new Scene(elementStudio);
        window.setTitle("Element Studio");
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
