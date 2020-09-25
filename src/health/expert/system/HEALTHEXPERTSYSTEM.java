/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.expert.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ONYEKA
 */
public class HEALTHEXPERTSYSTEM extends Application {
     private double xoffset=0;
    private double yoffset=0;
   
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
          stage.initStyle(StageStyle.UNDECORATED);
              stage.centerOnScreen();
              root.setOnMousePressed((MouseEvent event) -> {
              xoffset=event.getSceneX();
              yoffset= event.getSceneY();
              });           root.setOnMouseDragged((MouseEvent event) -> {
              stage.setX(event.getScreenX()-xoffset);
              stage.setY(event.getScreenY()-yoffset);
              }); 
                  
                  
                  stage.show();
                  
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
