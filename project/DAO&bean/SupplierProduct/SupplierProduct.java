// default package



/**
 * SupplierProduct entity. @author MyEclipse Persistence Tools
 */

public class SupplierProduct  implements java.io.Serializable {


    // Fields    

     private SupplierProductId id;


    // Constructors

    /** default constructor */
    public SupplierProduct() {
    }

    
    /** full constructor */
    public SupplierProduct(SupplierProductId id) {
        this.id = id;
    }

   
    // Property accessors

    public SupplierProductId getId() {
        return this.id;
    }
    
    public void setId(SupplierProductId id) {
        this.id = id;
    }
   








}