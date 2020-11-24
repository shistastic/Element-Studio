/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementstudio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adamj
 */
public class SeleccionarFondoController implements Initializable {
    
    public InputStream stream;
    public Image image;
    @FXML
    private Image test;
    
    @FXML
    private ImageView fondo;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    @FXML
    public void volver(ActionEvent event) throws IOException{
        Parent elementStudio = FXMLLoader.load(getClass().getResource("ElementStudio.fxml"));
        Scene scene = new Scene(elementStudio);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    public void fondo1() throws FileNotFoundException{
      System.out.println("It works!!!!");
       stream = new FileInputStream("D:\\Documents\\NetBeansProjects\\ElementStudio\\src\\elementstudio\\abstract-hand-painted-background_23-2148414132.jpg");
       image = new Image(stream);
      fondo.setImage(image);
      System.out.println(image);
    }
    
    @FXML
    public void fondo2() throws FileNotFoundException{
        System.out.println("It works2!!!!");
        stream = new FileInputStream("D:\\Documents\\NetBeansProjects\\ElementStudio\\src\\elementstudio\\descarga (11).jpg");
       image = new Image(stream);
      fondo.setImage(image);
    }
    @FXML
    public void fondo3() throws FileNotFoundException{
        System.out.println("It works3!!!!");
        stream = new FileInputStream("D:\\Documents\\NetBeansProjects\\ElementStudio\\src\\elementstudio\\How-can-colours-help-you-in-your-everyday-life.jpg");
       image = new Image(stream);
      fondo.setImage(image);
    }
   
    public Image getBg(){
        
        return image;
        
    }
}
