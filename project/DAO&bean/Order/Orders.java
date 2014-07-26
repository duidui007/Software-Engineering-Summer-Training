// default package

import java.util.Date;


/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders  implements java.io.Serializable {


    // Fields    

     private String orderId;
     private String customerId;
     private Date orderDate;
     private String payMethod;
     private Integer postage;
     private double totalMoney;
     private Date deliveryDate;
     private String deliveryMethod;
     private String consigneeName;
     private String consigneeAddress;
     private String consigneePostalCode;
     private String status;


    // Constructors

    /** default constructor */
    public Orders() {
    }

    
    /** full constructor */
    public Orders(String customerId, Date orderDate, String payMethod, Integer postage, double totalMoney, Date deliveryDate, String deliveryMethod, String consigneeName, String consigneeAddress, String consigneePostalCode, String status) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.payMethod = payMethod;
        this.postage = postage;
        this.totalMoney = totalMoney;
        this.deliveryDate = deliveryDate;
        this.deliveryMethod = deliveryMethod;
        this.consigneeName = consigneeName;
        this.consigneeAddress = consigneeAddress;
        this.consigneePostalCode = consigneePostalCode;
        this.status = status;
    }

   
    // Property accessors

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getPayMethod() {
        return this.payMethod;
    }
    
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public Integer getPostage() {
        return this.postage;
    }
    
    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    public double getTotalMoney() {
        return this.totalMoney;
    }
    
    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getDeliveryDate() {
        return this.deliveryDate;
    }
    
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }
    
    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getConsigneeName() {
        return this.consigneeName;
    }
    
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeAddress() {
        return this.consigneeAddress;
    }
    
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneePostalCode() {
        return this.consigneePostalCode;
    }
    
    public void setConsigneePostalCode(String consigneePostalCode) {
        this.consigneePostalCode = consigneePostalCode;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
   








}