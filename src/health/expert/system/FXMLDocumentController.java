/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.expert.system;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author ONYEKA
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane ambul;
      @FXML
    private ImageView minimize;

    @FXML
    private ImageView cancel;

    @FXML
    private JFXButton exit;

   @FXML
    private BorderPane mainborderpane;


    @FXML
    private ImageView bbbbb;
    public void settw(Node b){
    mainborderpane.setCenter(b);
    }
    
    @FXML
    private void diagn(ActionEvent e){
         
     try {
            Parent root = FXMLLoader.load(getClass().getResource("themainthing.fxml"));
            
            mainborderpane.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
    
    }
      @FXML
    private void pat(ActionEvent e){
         
     try {
            Parent root = FXMLLoader.load(getClass().getResource("level_ofsick.fxml"));
            
            mainborderpane.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
    
    }
      @FXML
     private void minimize(MouseEvent event){
          if (event.getSource()==minimize) {
            ((Stage)  exit.getScene().getWindow()).setIconified(true);
          }
          
     
     }
     
     @FXML
     private void exit(MouseEvent event){
            System.exit(0);
     
 
     
     }   @FXML
     private void exit1(MouseEvent event){
            System.exit(0);
     
 
     
     }  
  @FXML
    private void dasg(ActionEvent e){
         
     try {
            Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            
            mainborderpane.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
    
    }
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     try {
            Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
            
            mainborderpane.setCenter(root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
      TranslateTransition transision=new TranslateTransition();
        transision.setDuration(Duration.millis(4000));
transision.setNode(bbbbb);
transision.setByX(300);
transision.setCycleCount(TranslateTransition.INDEFINITE);
transision.setAutoReverse(true);
transision.play();

  // TODO
    }    
    
}
