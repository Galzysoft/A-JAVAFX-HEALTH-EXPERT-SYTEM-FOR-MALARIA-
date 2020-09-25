/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.expert.system;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ONYEKA
 */
public class patient_table {
      private final StringProperty NAME;
         private final StringProperty PHONE;
         private final StringProperty ADDRESS;
  private final StringProperty AGE;
private final StringProperty GENDER;
 
        
 
 
    public patient_table(String NAME, String PHONE ,String ADDRESS,String AGE,String GENDER) {
    
      this.NAME=new SimpleStringProperty(NAME);
            this.PHONE=new SimpleStringProperty(PHONE);
            this.ADDRESS=new SimpleStringProperty(ADDRESS);
              this.AGE=new SimpleStringProperty(AGE);
            this.GENDER=new SimpleStringProperty(GENDER);
              }

    public String getName() {
        return NAME.get();
    }
 public String getphone() {
        return PHONE.get();
    } 
 public String getaddress() {
        return ADDRESS.get();
    } 
 public String getage() {
        return AGE.get();
    }
 public String getgender() {
        return GENDER.get();
    }
  
    public void setName(String fName) {
        NAME.set(fName);
    }
     public void setphone(String fName) {
        PHONE.set(fName);
    }
     public void setaddress(String fName) {
       ADDRESS.set(fName);
    }
     public void setage(String fName) {
       AGE.set(fName);
    } 
      public void setgender(String fName) {
       GENDER.set(fName);
    }
           public StringProperty NAMEProperty()
    {return NAME;}
    public StringProperty PHONEProperty()
    {return PHONE;}
    public StringProperty ADDRESSProperty()
    {return ADDRESS;}
     public StringProperty AGEProperty()
    {return AGE;}
      public StringProperty GENDERProperty()
    {return GENDER;}
  

}

