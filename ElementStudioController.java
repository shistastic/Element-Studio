/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementstudio;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adamj
 */
public class ElementStudioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
      
    }    
    
    @FXML
    public void comenzar(ActionEvent event) throws IOException{
        Parent cambiador = FXMLLoader.load(getClass().getResource("CambiadorElementos.fxml"));
        Scene scene = new Scene(cambiador);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    @FXML
    public void cambiarFondo(ActionEvent event) throws IOException{
        Parent selecFondo = FXMLLoader.load(getClass().getResource("SeleccionarFondo.fxml"));
        Scene scene = new Scene(selecFondo);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
}
