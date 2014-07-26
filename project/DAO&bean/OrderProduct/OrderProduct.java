// default package



/**
 * OrderProduct entity. @author MyEclipse Persistence Tools
 */

public class OrderProduct  implements java.io.Serializable {


    // Fields    

     private OrderProductId id;


    // Constructors

    /** default constructor */
    public OrderProduct() {
    }

    
    /** full constructor */
    public OrderProduct(OrderProductId id) {
        this.id = id;
    }

   
    // Property accessors

    public OrderProductId getId() {
        return this.id;
    }
    
    public void setId(OrderProductId id) {
        this.id = id;
    }
   








}