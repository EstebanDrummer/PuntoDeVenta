package controller;
// Generated 26-jul-2013 17:12:55 by Hibernate Tools 3.2.1.GA



/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private String CId;
     private String CNombre;
     private String CTipo;

    public Cliente() {
    }

	
    public Cliente(String CId) {
        this.CId = CId;
    }
    public Cliente(String CId, String CNombre, String CTipo) {
       this.CId = CId;
       this.CNombre = CNombre;
       this.CTipo = CTipo;
    }
   
    public String getCId() {
        return this.CId;
    }
    
    public void setCId(String CId) {
        this.CId = CId;
    }
    public String getCNombre() {
        return this.CNombre;
    }
    
    public void setCNombre(String CNombre) {
        this.CNombre = CNombre;
    }
    public String getCTipo() {
        return this.CTipo;
    }
    
    public void setCTipo(String CTipo) {
        this.CTipo = CTipo;
    }




}


