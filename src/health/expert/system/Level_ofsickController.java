/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.expert.system;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class Level_ofsickController implements Initializable {
  private ObservableList<patient_table> data;
@FXML
    private TableColumn<patient_table,String> viewname;

    @FXML
    private TableColumn<patient_table,String> viewGENDER;

    @FXML
    private TableColumn<patient_table,String> viewADDRESS;

    @FXML
    private TableColumn<patient_table,String> viewAGE;

    @FXML
    private TableView<patient_table> tableview;

    @FXML
    private TableColumn<patient_table,String> viewPHONE;
    /**
     * Initializes the controller class.
     */
    Connection con=null;
   private void refreshtable()  {
     
    // TODO
   try{
        databaseonline();
        data=FXCollections.observableArrayList();
          ResultSet rs=con.createStatement().executeQuery("select * from patients_info ");
        while (rs.next()){
            data.add(new patient_table(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4) , rs.getString(5)));
         } }catch(SQLException se){
            System.out.println("Error connecting to database !");
        }
        viewname.setCellValueFactory(new PropertyValueFactory<>("NAME"));
        viewPHONE.setCellValueFactory(new PropertyValueFactory<>("PHONE" ) );
        viewADDRESS.setCellValueFactory(new PropertyValueFactory<>("ADDRESS"));
        viewAGE.setCellValueFactory(new PropertyValueFactory<>("AGE"));
        viewGENDER.setCellValueFactory(new PropertyValueFactory<>("GENDER"));
      
       tableview.setItems(null);
     tableview.setItems(data);
      //  college.getItems().addAll(data);
           
   
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     databaseonline(); 
     refreshtable();// TODO
    }    
     private void databaseonline()  {  
       
       
    try {
        //   jdbc:mysql://localhost:3306/project_manager?zeroDateTimeBehavior=convertToNull [root on Default schema]
        
       
        
             con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/health_expert", "root","");
  System.out.println("connected successfull"); 
 /* 
          con = (Connection)DriverManager.getConnection("jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2243538", "sql2243538","vZ6%dN2*");
  System.out.println("connected successfull"); 
 
      */ 
        //   String url = "jdbc:mysql://localhost/project_manager";
      } catch (SQLException ex) {
     Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Connection Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Server Timed Out OR UnReachable");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
    
      
      
      }
}
}
