// default package



/**
 * OrderProductId entity. @author MyEclipse Persistence Tools
 */

public class OrderProductId  implements java.io.Serializable {


    // Fields    

     private String productId;
     private String orderId;


    // Constructors

    /** default constructor */
    public OrderProductId() {
    }

    
    /** full constructor */
    public OrderProductId(String productId, String orderId) {
        this.productId = productId;
        this.orderId = orderId;
    }

   
    // Property accessors

    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrderProductId) ) return false;
		 OrderProductId castOther = ( OrderProductId ) other; 
         
		 return ( (this.getProductId()==castOther.getProductId()) || ( this.getProductId()!=null && castOther.getProductId()!=null && this.getProductId().equals(castOther.getProductId()) ) )
 && ( (this.getOrderId()==castOther.getOrderId()) || ( this.getOrderId()!=null && castOther.getOrderId()!=null && this.getOrderId().equals(castOther.getOrderId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getProductId() == null ? 0 : this.getProductId().hashCode() );
         result = 37 * result + ( getOrderId() == null ? 0 : this.getOrderId().hashCode() );
         return result;
   }   





}