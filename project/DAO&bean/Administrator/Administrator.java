// default package



/**
 * Administrator entity. @author MyEclipse Persistence Tools
 */

public class Administrator  implements java.io.Serializable {


    // Fields    

     private String administratorId;
     private String administratorName;
     private String password;
     private String privilege;


    // Constructors

    /** default constructor */
    public Administrator() {
    }

    
    /** full constructor */
    public Administrator(String administratorName, String password, String privilege) {
        this.administratorName = administratorName;
        this.password = password;
        this.privilege = privilege;
    }

   
    // Property accessors

    public String getAdministratorId() {
        return this.administratorId;
    }
    
    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    public String getAdministratorName() {
        return this.administratorName;
    }
    
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivilege() {
        return this.privilege;
    }
    
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
   








}