// default package

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Products entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Products
  * @author MyEclipse Persistence Tools 
 */
public class ProductsDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ProductsDAO.class);
		//property constants
	public static final String CATEGORY_ID = "categoryId";
	public static final String PRODUCT_NAME = "productName";
	public static final String MARKET_PRICE = "marketPrice";
	public static final String ACTIVITY = "activity";



    
    public void save(Products transientInstance) {
        log.debug("saving Products instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Products persistentInstance) {
        log.debug("deleting Products instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Products findById( java.lang.String id) {
        log.debug("getting Products instance with id: " + id);
        try {
            Products instance = (Products) getSession()
                    .get("Products", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Products instance) {
        log.debug("finding Products instance by example");
        try {
            List results = getSession()
                    .createCriteria("Products")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Products instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Products as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByCategoryId(Object categoryId
	) {
		return findByProperty(CATEGORY_ID, categoryId
		);
	}
	
	public List findByProductName(Object productName
	) {
		return findByProperty(PRODUCT_NAME, productName
		);
	}
	
	public List findByMarketPrice(Object marketPrice
	) {
		return findByProperty(MARKET_PRICE, marketPrice
		);
	}
	
	public List findByActivity(Object activity
	) {
		return findByProperty(ACTIVITY, activity
		);
	}
	

	public List findAll() {
		log.debug("finding all Products instances");
		try {
			String queryString = "from Products";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Products merge(Products detachedInstance) {
        log.debug("merging Products instance");
        try {
            Products result = (Products) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Products instance) {
        log.debug("attaching dirty Products instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Products instance) {
        log.debug("attaching clean Products instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}