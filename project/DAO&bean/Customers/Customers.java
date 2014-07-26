// default package

import java.util.Date;


/**
 * Customers entity. @author MyEclipse Persistence Tools
 */

public class Customers  implements java.io.Serializable {


    // Fields    

     private String customerId;
     private String customerName;
     private String realName;
     private String password;
     private String sex;
     private String question;
     private String answer;
     private String email;
     private String address;
     private String postalCode;
     private String phone;
     private String fax;
     private Date registerDate;
     private Integer integral;


    // Constructors

    /** default constructor */
    public Customers() {
    }

    
    /** full constructor */
    public Customers(String customerName, String realName, String password, String sex, String question, String answer, String email, String address, String postalCode, String phone, String fax, Date registerDate, Integer integral) {
        this.customerName = customerName;
        this.realName = realName;
        this.password = password;
        this.sex = sex;
        this.question = question;
        this.answer = answer;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
        this.fax = fax;
        this.registerDate = registerDate;
        this.integral = integral;
    }

   
    // Property accessors

    public String getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRealName() {
        return this.realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQuestion() {
        return this.question;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }
    
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getIntegral() {
        return this.integral;
    }
    
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
   








}