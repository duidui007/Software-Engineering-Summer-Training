// default package



/**
 * Categories entity. @author MyEclipse Persistence Tools
 */

public class Categories  implements java.io.Serializable {


    // Fields    

     private String categoryId;
     private String categoryName;
     private byte[] picture;


    // Constructors

    /** default constructor */
    public Categories() {
    }

    
    /** full constructor */
    public Categories(String categoryName, byte[] picture) {
        this.categoryName = categoryName;
        this.picture = picture;
    }

   
    // Property accessors

    public String getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public byte[] getPicture() {
        return this.picture;
    }
    
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
   








}