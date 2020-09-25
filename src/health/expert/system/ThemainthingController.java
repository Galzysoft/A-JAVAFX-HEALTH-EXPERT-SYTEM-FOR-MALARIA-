/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.expert.system;

import com.jfoenix.controls.JFXTabPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;

/**
 * FXML Controller class
 *
 * @author ONYEKA
 */
public class ThemainthingController implements Initializable {
  
   @FXML
    private Tab tselectsymp;

    @FXML
    private RadioButton mediumcough;

    @FXML
    private JFXRadioButton cough1;

    @FXML
    private JFXRadioButton chest1;

    @FXML
    private RadioButton mediumshort;

    @FXML
    private JFXCheckBox cough;

    @FXML
    private Tab tblood;

    @FXML
    private JFXRadioButton whitetongue1;

    @FXML
    private JFXTextArea coughdiognoses;

    @FXML
    private JFXRadioButton blood1;

    @FXML
    private RadioButton highbood;

    @FXML
    private Tab twhite;

    @FXML
    private Tab tchest;

    @FXML
    private JFXRadioButton female;

    @FXML
    private JFXRadioButton shortness1;

    @FXML
    private RadioButton veryhighcough;

    @FXML
    private RadioButton highcough;

    @FXML
    private JFXCheckBox chest;

    @FXML
    private JFXTextArea sgortdiagnosis;

    @FXML
    private RadioButton lowchest;

    @FXML
    private Tab tcough;

    @FXML
    private ToggleGroup symptoms;

    @FXML
    private ToggleGroup bloodgroup;

    @FXML
    private RadioButton mediumwhite;

    @FXML
    private JFXTextField phone;

    @FXML
    private JFXTextField name;

    @FXML
    private RadioButton verylowcough;

    @FXML
    private JFXCheckBox whitetongue;

    @FXML
    private JFXRadioButton male;

    @FXML
    private RadioButton lowshort;

    @FXML
    private RadioButton veryhighblood;

    @FXML
    private RadioButton verylowwhite;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton veryhighchest;

    @FXML
    private RadioButton highwhite;

    @FXML
    private JFXTextArea whitediagnosis;

    @FXML
    private RadioButton verylowshort;

    @FXML
    private JFXTextArea blooddiagnosis;

    @FXML
    private RadioButton verylowchest;

    @FXML
    private ToggleGroup chestgroup;

    @FXML
    private RadioButton veryhighwhite;

    @FXML
    private RadioButton lowcough;

    @FXML
    private RadioButton lowblood;

    @FXML
    private RadioButton highshort;

    @FXML
    private RadioButton mediumchest;

    @FXML
    private ToggleGroup coughgroup;

    @FXML
    private JFXTextArea chestdiagnosis;

    @FXML
    private JFXTextArea address;

    @FXML
    private RadioButton mediumblood;

    @FXML
    private Label sel;


    @FXML
    private JFXTabPane tabpaneeeee;

    @FXML
    private JFXCheckBox blood;

    @FXML
    private Tab home;

    @FXML
    private RadioButton lowwhite;

    @FXML
    private RadioButton veryhighshort;

    @FXML
    private RadioButton verylowblood;

    @FXML
    private JFXCheckBox shortness;

    @FXML
    private RadioButton highchest;

    @FXML
    private JFXTextField age;

    @FXML
    private Tab tshort;

Connection con=null;

String first,second,third,fourth,fift,gendera,namea;
   ArrayList id=new ArrayList();int position;
     @FXML
     private void genoo(ActionEvent event)  {
   
    if (male .isSelected()) {gendera="MALE";sel.setText("MALE");System.out.println(sel.getText());}
    else if (female .isSelected()) {gendera="FEMALE";;sel.setText("FEMALE");System.out.println(sel.getText());}}
     @FXML
     private void clear(ActionEvent event)  {
         name.setText(null);
         phone.setText(null);
         address.setText(null);
         age.setText(null); 
           sel.setText("ben"); 
       
        if(male.isSelected()){male.setSelected(false);}
       else if(female.isSelected()){female.setSelected(false);}
     }
    @FXML
     private void patient(ActionEvent event)  {
          if(!(name.getText().length()==0||phone.getText().length()==0||age.getText().isEmpty()||address.getText().length()==0||sel.getText().contains("ben")))
    {  
          
        databaseonline();
          String sql="INSERT INTO patients_info (name,phone,address,age,gender) VALUES(?,?,?,?,?) ";
    
           
        PreparedStatement pst;
    try {
        pst = con.prepareStatement(sql);
         pst.setString(1, name.getText());
          pst.setString(2, phone.getText());
          pst.setString(3, address.getText());
    
         pst.setString(4, age.getText());
    pst.setString(5, gendera);

        
        pst.executeUpdate();
       /* */ namea=name.getText();
                Alert loginerror1 = new Alert(Alert.AlertType.INFORMATION);
                loginerror1.setTitle("Registration sucessfull");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(namea+" Your Registration is  sucessfull thanks for using Health Expert System\n you can now proceed to the next page just siply click on next");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();     
    tabpaneeeee.getSelectionModel().select(tselectsymp);  // TODO
   
           } catch (SQLException ex) {
      Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
               loginerror1.setTitle("Registration is Not sucessfull ");
               loginerror1.setHeaderText(null);
               loginerror1.setContentText("  Your Registration is Not sucessfull  Please Review And TryAgain ");
               loginerror1.initModality(Modality.APPLICATION_MODAL);
               loginerror1.showAndWait();
    } 
    }else{    Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Empty fields");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("One Or More Fields Are Empty ");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
  } }
     
    @FXML
     private void coughlevel(ActionEvent event)  {
         if (lowcough.isSelected()) {coughdiognoses.setText(namea+" You Have Common Cold\n" +
"Common Cold Overview\n" +
"\n" +
"A cold is a common viral infection of the upper respiratory tract–namely, your nose and throat. A runny or stuffy nose, sneezing, coughing, and sore throat are common…");}
         else if (verylowcough.isSelected()) {coughdiognoses.setText(namea+" You Have Cold and Flu\n" +
"Cold and Flu\n" +
"\n" +
"Common colds and influenza are contagious infections that affect the respiratory system. Both are airborne illnesses, spread through coughing and sneezing.");}
         else if (mediumcough.isSelected()) {coughdiognoses.setText(namea+" You Have Acute Bronchitis\n" +
"Acute Bronchitis:\n" +
"\n" +
"Acute bronchitis causes coughs that produce mucus. You don't need antibiotics, but bed rest and home care can help.");}
        else if (highcough.isSelected()) {coughdiognoses.setText(namea+" You Have Whooping Cough (Pertussis)\n" +
"Whooping Cough (Pertussis)\n" +
"\n" +
"Whooping cough is a serious respiratory infection that can be deadly for infants and young children. It causes uncontrollable coughing and difficulty breathing. Infants…");}
        else if (veryhighcough.isSelected()) {coughdiognoses.setText(namea+" You Have Tuberculosis\n" +
"Tuberculosis\n" +
"\n" +
"Tuberculosis (TB) is a highly infectious disease that primarily affects the lungs. Largely thought of as a disease of the past, tuberculosis still kills over a million…");}
   } @FXML
     private void chestlevel(ActionEvent event)  {
         if (lowchest.isSelected()) {chestdiagnosis.setText(namea+" You Have Heartburn\n" +
"Heartburn\n" +
"\n" +
"Heartburn is a burning sensation in your chest that often occurs with a bitter taste in your throat or mouth. The symptoms of heartburn may get worse after you eat a…");}
           if (verylowchest.isSelected()) {chestdiagnosis.setText(namea+" You Have Acid Reflux and GERD Overview\n" +
"Acid Reflux and GERD Overview\n" +
"\n" +
"Acid reflux symptoms are caused when stomach contents flow up from the stomach back into the esophagus, causing symptoms like heartburn, stomach pain, and burping.");}
           if (mediumchest.isSelected()) {chestdiagnosis.setText(namea+" You Have Acute Bronchitis\n" +
"Acute Bronchitis:\n" +
"\n" +
"Acute bronchitis causes coughs that produce mucus. You don't need antibiotics, but bed rest and home care can help.");}
          if (highchest.isSelected()) {chestdiagnosis.setText(namea+" You Have Unstable Angina\n" +
"Unstable Angina\n" +
"This condition is considered a medical emergency. Urgent care may be required.\n" +
"\n" +
"Angina is a condition marked by a crushing chest pain. It's due to inadequate blood supply to your heart muscle, which deprives your heart of oxygen.");}
          if (veryhighchest.isSelected()) {chestdiagnosis.setText(namea+" You Have Heart Attack\n" +
"Heart Attack\n" +
"This condition is considered a medical emergency. Urgent care may be required.\n" +
"\n" +
"During a heart attack, blood supply that normally nourishes the heart with oxygen is cut off and the heart muscle begins to die. Here's what you should know.");}
   }
     @FXML
     private void bloodlevel(ActionEvent event)  {
         if (lowblood.isSelected()) {blooddiagnosis.setText(namea+" You Have Bronchiectasis\n" +
"Bronchiectasis\n" +
"\n" +
"Bronchiectasis causes symptoms like chronic coughing, coughing up blood, wheezing, and shortness of breath. Read about treatment options.");} 
          if (mediumblood.isSelected()) {blooddiagnosis.setText(namea+"You Have Blood-Tinged Sputum\n" +
"Blood-Tinged Sputum\n" +

"Sputum, or phlegm, is a mixture of saliva and mucus that you’ve coughed up. Blood-tinged sputum occurs when the sputum has visible streaks of blood in it. The blood comes from somewhere along the respiratory tract inside your body. The respiratory\n" +
"" +
"\n ");}
           if (verylowblood.isSelected()) {blooddiagnosis.setText(namea+" You Have Pulmonary Tuberculosis\n" +
"Pulmonary Tuberculosis\n" +
"\n" +
"Pulmonary tuberculosis (TB) is a contagious, infectious disease that attacks your lungs. People with the germ have a 10 percent lifetime risk of getting sick with TB…");}
            if (highbood.isSelected()) {blooddiagnosis.setText(namea+" You Have Pulmonary Embolism\n" +
"Pulmonary Embolism\n" +
"This condition is considered a medical emergency. Urgent care may be required.\n" +
"\n" +
"A pulmonary embolism is a blood clot that occurs in the lungs. It can damage part of the lung and other organs and decrease oxygen levels in the blood.");}
            if (veryhighblood.isSelected()) {blooddiagnosis.setText(namea+" You Have Ebola Virus and Disease\n" +
"Ebola Virus and Disease\n" +
"This condition is considered a medical emergency. Urgent care may be required.\n" +
"\n" +
"Ebola disease is a rare, often fatal illness. One of its late-stage symptoms is a bleeding rash over the entire body.");}}
 @FXML
     private void shortlevel(ActionEvent event)  {
         if (lowshort.isSelected()) {sgortdiagnosis.setText(namea+" You Have Asthma\n" +
                 "Asthma\n" +

"Asthma is the most common reason for presenting to the emergency room with shortness of breath (2). It is a disease that affects about 5% of the population.\n" +
"\n" +
"Asthma is a condition in which the airways narrow and swell and produce extra mucus. This can cause shortness of breath, wheezing, tightness in the chest, and a nonproductive cough.");}
   if (verylowshort.isSelected()) {sgortdiagnosis.setText(namea+" You Have Interstitial Lung Disease (ILD)\n" +
           " Interstitial Lung Disease (ILD)\n" +

"The term interstitial lung disease (ILD) refers to a broad category of lung diseases rather than a distinct disease entity. It includes a variety of illnesses with different underlying causes. These disorders are grouped together because of similarities in their clinical presentations, radiographic appearance, and physiologic features ");}
   if (mediumshort.isSelected()) {sgortdiagnosis.setText(namea+" You Have Pulmonary Embolism\n" +
           "Pulmonary Embolism\n" +

"Pulmonary embolism is a blockage in one or both of the pulmonary arteries within the lungs. It is caused by blood clots that travel from the lower extremities, through the right heart chambers, and lodge in the lungs");}
   if (veryhighshort.isSelected()) {sgortdiagnosis.setText(namea+" You Have Pneumothorax\n" +
           "Pneumothorax\n" +

"A pneumothorax is when air builds up in the pleural sac, between the outside of the lung and the inside the chest wall (9). The air can come from the lung or from outside the body if there is a chest injury. A large pneumothorax may compress the lung causing it to collapse.");}
   if (highshort.isSelected()) {sgortdiagnosis.setText(namea+" You Have Pulmonary Hypertension\n" +
           " Pulmonary Hypertension\n" +

"Pulmonary hypertension is a disease caused by elevated pressure (hypertension) in the pulmonary arteries");}
   
     }
      @FXML
     private void whitelevel(ActionEvent event)  {
         if (lowwhite.isSelected()) {whitediagnosis.setText(namea+" You Have Pulmonary Leukoplakia\n" +
                  "Leukoplakia: This condition causes white patches to form on the inside of your cheeks, along your gums, and sometimes on your tongue. You can get leukoplakia if you smoke or chew tobacco. Excess alcohol use is another cause. The white patches are usually harmless. But in rare cases, leukoplakia can develop into oral cancer.");}
               if (verylowwhite.isSelected()) {whitediagnosis.setText(namea+" You Have Oral lichen planus\n" +
                       "Oral lichen planus: With this condition, a problem with your immune system causes white patches to form in your mouth and on your tongue. Along with the white tongue, your gums may be sore. You might also have sores along the inside lining of your mouth. ");}
        if (mediumwhite.isSelected()) {whitediagnosis.setText(namea+" You Have Syphilis\n" +
                "Syphilis: This sexually transmitted infection can cause sores in your mouth. If syphilis isn’t treated, white patches called syphilitic leukoplakia can form on your tongue. ");}
        if (highwhite.isSelected()) {whitediagnosis.setText(namea+" You Have Oral thrush\n" +
                 "Oral thrush: This is an infection of the mouth caused by Candida yeast. You’re more likely to get oral thrush if you have diabetes, a weakened immune system from a condition like HIV or AIDS, an iron or vitamin B deficiency, or if you wear dentures.");}
        if (veryhighwhite.isSelected()) {whitediagnosis.setText(namea+" You Have Scalloped Tongue\n" +
                "Scalloped Tongue?\n" +

"Here's what may be behind a scalloped tongue, also known as a wavy tongue.  it is been caused by bemina pamaadises.");}
          }
   
     @FXML
     private void exitt(ActionEvent event)  {
         tabpaneeeee     .getScene().getWindow().hide();
     }
      @FXML
     private void cou(ActionEvent event)  {
  if(cough1.isSelected()){position=2;System.out.println("id added = "+position);}
     } @FXML
     private void blood(ActionEvent event)  {
   if(blood1.isSelected()){position=4;System.out.println("id added = "+position);}
    } @FXML
     private void white(ActionEvent event)  {
    if(whitetongue1.isSelected()){position=6;System.out.println("id added = "+position);}
  } @FXML
     private void chest(ActionEvent event)  {
    if(chest1.isSelected()){position=3;System.out.println("id added = "+position);}
     } @FXML
     private void shortn(ActionEvent event)  {
   if(shortness1.isSelected()){position=5;System.out.println("id added = "+position);}
   }
     
     
     @FXML
     private void getcough(ActionEvent event)  {
        tabpaneeeee.getSelectionModel().select(tselectsymp);
            
            } 
     @FXML
     private void getwhite(ActionEvent event)  {
         tabpaneeeee.getSelectionModel().select(tselectsymp);
            
              } 
     @FXML
     private void getblood(ActionEvent event)  {
        tabpaneeeee.getSelectionModel().select(tselectsymp);
            
              } 
     @FXML
     private void getshort(ActionEvent event)  {
        tabpaneeeee.getSelectionModel().select(tselectsymp);
            
            } 
     @FXML
     private void getchest(ActionEvent event)  {
               tabpaneeeee.getSelectionModel().select(tselectsymp);
     
       
           // tabpaneeeee.getSelectionModel().select((Tab) tabuu);
 
         }   @FXML
     private void getchest1(ActionEvent event)  {
            tabpaneeeee.getSelectionModel().select(position);
            
       
           // tabpaneeeee.getSelectionModel().select((Tab) tabuu);
 
         }
     @FXML
     private void next(ActionEvent event)  {
         
    tabpaneeeee.getSelectionModel().select(tselectsymp);  // TODO
       }
     @FXML
     private void previos(ActionEvent event)  {
    tabpaneeeee.getSelectionModel().select(home);  // TODO
       }
      @Override
    public void initialize(URL url, ResourceBundle rb) {databaseonline();
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
}}
