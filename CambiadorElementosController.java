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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author adamj
 */
public class CambiadorElementosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label tituloCambiador;
    @FXML
    private Button escMost;
    
    int numeroAnterior;
    int contador = 0;
    boolean mostrarTitulo = true;
    
    public static int randomi(int n){
       int numero = (int) (Math.random() * n) +1;
       return numero;
    }
   
   
    @FXML
    public void cambiarTexto(ActionEvent event) throws IOException{
    
    int numero = randomi(3); //Generar numero random
    
    //Evitar mismo numero de forma consecutiva
    if(numeroAnterior == numero && numero == 3){
        numero--;
    }else if(numeroAnterior == numero && numero == 2){
        numero++;
    }else if(numeroAnterior == numero && numero == 1){
        numero++;
    }
   
        //Opciones de titulo aleatorio
        switch (numero) {
            case 1 -> tituloCambiador.setText("Colores Locos!!");
            case 2 -> tituloCambiador.setText("Soy un nuevo titulo");
            default -> tituloCambiador.setText("Los Cerdos Vuelan");
        }
     numeroAnterior = numero;    
        
    }
     @FXML
    public void cambiarTamaño(ActionEvent event) throws IOException{
        switch (contador) {
            case 0 -> {
                tituloCambiador.setStyle("-fx-font: 50px Chiller;");
                contador++;
            }
            case 1 -> {
                tituloCambiador.setStyle("-fx-font: 36px Chiller;");
                contador++;
            }
            case 2 -> {
                tituloCambiador.setStyle("-fx-font: 22px Chiller;");
                contador++;
            }
            case 3 -> {
                tituloCambiador.setStyle("-fx-font: 64px Chiller;");
                contador = 0;
            }
            default -> {
            }
        }
        
        
        
    }
     @FXML
    public void cambiarColor(ActionEvent event) throws IOException{
        
        
      int numero = randomi(3); //Generar numero random
    
    //Evitar mismo numero de forma consecutiva
    if(numeroAnterior == numero && numero == 3){
        numero--;
    }else if(numeroAnterior == numero && numero == 2){
        numero++;
    }else if(numeroAnterior == numero && numero == 1){
        numero++;
    }
   
        //Opciones de titulo aleatorio
        switch (numero) {
            case 1 -> tituloCambiador.setStyle("-fx-text-fill: green;");
            case 2 -> tituloCambiador.setStyle("-fx-text-fill: red;");
            default -> tituloCambiador.setStyle("-fx-text-fill: yellow;");
        }
     numeroAnterior = numero;    
     
        
        
    }
     @FXML
    public void esconderTitulo(ActionEvent event) throws IOException{
        if(mostrarTitulo == true){
        tituloCambiador.setVisible(false);
        mostrarTitulo = false;
        escMost.setText("Mostrar Titulo");
        } else if (mostrarTitulo == false){
            tituloCambiador.setVisible(true);
            mostrarTitulo = true;
            escMost.setText("Esconder Titulo");
        }
        
    }
     @FXML
    public void volver(ActionEvent event) throws IOException{
        Parent elementStudio = FXMLLoader.load(getClass().getResource("ElementStudio.fxml"));
        Scene scene = new Scene(elementStudio);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
