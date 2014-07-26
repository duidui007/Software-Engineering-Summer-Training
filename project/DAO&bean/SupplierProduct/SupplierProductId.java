// default package



/**
 * SupplierProductId entity. @author MyEclipse Persistence Tools
 */

public class SupplierProductId  implements java.io.Serializable {


    // Fields    

     private String supplierId;
     private String productId;


    // Constructors

    /** default constructor */
    public SupplierProductId() {
    }

    
    /** full constructor */
    public SupplierProductId(String supplierId, String productId) {
        this.supplierId = supplierId;
        this.productId = productId;
    }

   
    // Property accessors

    public String getSupplierId() {
        return this.supplierId;
    }
    
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SupplierProductId) ) return false;
		 SupplierProductId castOther = ( SupplierProductId ) other; 
         
		 return ( (this.getSupplierId()==castOther.getSupplierId()) || ( this.getSupplierId()!=null && castOther.getSupplierId()!=null && this.getSupplierId().equals(castOther.getSupplierId()) ) )
 && ( (this.getProductId()==castOther.getProductId()) || ( this.getProductId()!=null && castOther.getProductId()!=null && this.getProductId().equals(castOther.getProductId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSupplierId() == null ? 0 : this.getSupplierId().hashCode() );
         result = 37 * result + ( getProductId() == null ? 0 : this.getProductId().hashCode() );
         return result;
   }   





}