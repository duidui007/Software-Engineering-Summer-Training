// default package

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for SupplierProduct entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .SupplierProduct
  * @author MyEclipse Persistence Tools 
 */
public class SupplierProductDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SupplierProductDAO.class);
		//property constants



    
    public void save(SupplierProduct transientInstance) {
        log.debug("saving SupplierProduct instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(SupplierProduct persistentInstance) {
        log.debug("deleting SupplierProduct instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public SupplierProduct findById( SupplierProductId id) {
        log.debug("getting SupplierProduct instance with id: " + id);
        try {
            SupplierProduct instance = (SupplierProduct) getSession()
                    .get("SupplierProduct", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(SupplierProduct instance) {
        log.debug("finding SupplierProduct instance by example");
        try {
            List results = getSession()
                    .createCriteria("SupplierProduct")
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
      log.debug("finding SupplierProduct instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from SupplierProduct as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}


	public List findAll() {
		log.debug("finding all SupplierProduct instances");
		try {
			String queryString = "from SupplierProduct";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public SupplierProduct merge(SupplierProduct detachedInstance) {
        log.debug("merging SupplierProduct instance");
        try {
            SupplierProduct result = (SupplierProduct) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(SupplierProduct instance) {
        log.debug("attaching dirty SupplierProduct instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(SupplierProduct instance) {
        log.debug("attaching clean SupplierProduct instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}