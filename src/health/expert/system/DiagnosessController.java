/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.expert.system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class DiagnosessController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void next(ActionEvent e){
         try {
   FXMLLoader loader= FXMLLoader.load(getClass().getResource("themainthing.fxml"));
             Parent root = loader.load();
            FXMLLoader loader1= FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        //     Parent root1 = loader1.load();
      FXMLDocumentController ma=(FXMLDocumentController)loader1.getController();
      ma.settw(root);
    } catch (IOException ex) {
         Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Connection Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" erooorooo "+ex.getMessage());
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
   }
        
        
        /*
        
          try {
        Parent root = FXMLLoader.load(getClass().getResource("themainthing.fxml"));
        Dialog dd=new Dialog();
        dd.getDialogPane().setContent(root);
        dd.initStyle(StageStyle.UNDECORATED);
        dd.show();
    } catch (IOException ex) {
        System.out.println(ex.getMessage()); }
        */
  
           
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
