// default package

import java.util.Date;


/**
 * Suppliers entity. @author MyEclipse Persistence Tools
 */

public class Suppliers  implements java.io.Serializable {


    // Fields    

     private String supplierId;
     private String administratorId;
     private String userName;
     private String address;
     private String phone;
     private String type;
     private Date loginTime;
     private String postalCode;
     private String remark;
     private String groupactivity;


    // Constructors

    /** default constructor */
    public Suppliers() {
    }

    
    /** full constructor */
    public Suppliers(String administratorId, String userName, String address, String phone, String type, Date loginTime, String postalCode, String remark, String groupactivity) {
        this.administratorId = administratorId;
        this.userName = userName;
        this.address = address;
        this.phone = phone;
        this.type = type;
        this.loginTime = loginTime;
        this.postalCode = postalCode;
        this.remark = remark;
        this.groupactivity = groupactivity;
    }

   
    // Property accessors

    public String getSupplierId() {
        return this.supplierId;
    }
    
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getAdministratorId() {
        return this.administratorId;
    }
    
    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Date getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGroupactivity() {
        return this.groupactivity;
    }
    
    public void setGroupactivity(String groupactivity) {
        this.groupactivity = groupactivity;
    }
   








}