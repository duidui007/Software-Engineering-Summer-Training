// default package



/**
 * Products entity. @author MyEclipse Persistence Tools
 */

public class Products  implements java.io.Serializable {


    // Fields    

     private String productId;
     private String categoryId;
     private String productName;
     private double marketPrice;
     private byte[] picture;
     private String activity;


    // Constructors

    /** default constructor */
    public Products() {
    }

    
    /** full constructor */
    public Products(String categoryId, String productName, double marketPrice, byte[] picture, String activity) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.marketPrice = marketPrice;
        this.picture = picture;
        this.activity = activity;
    }

   
    // Property accessors

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getMarketPrice() {
        return this.marketPrice;
    }
    
    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public byte[] getPicture() {
        return this.picture;
    }
    
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getActivity() {
        return this.activity;
    }
    
    public void setActivity(String activity) {
        this.activity = activity;
    }
   








}