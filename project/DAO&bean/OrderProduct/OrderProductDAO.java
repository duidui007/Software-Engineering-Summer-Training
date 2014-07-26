// default package

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for OrderProduct entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .OrderProduct
  * @author MyEclipse Persistence Tools 
 */
public class OrderProductDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(OrderProductDAO.class);
		//property constants



    
    public void save(OrderProduct transientInstance) {
        log.debug("saving OrderProduct instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(OrderProduct persistentInstance) {
        log.debug("deleting OrderProduct instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public OrderProduct findById( OrderProductId id) {
        log.debug("getting OrderProduct instance with id: " + id);
        try {
            OrderProduct instance = (OrderProduct) getSession()
                    .get("OrderProduct", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(OrderProduct instance) {
        log.debug("finding OrderProduct instance by example");
        try {
            List results = getSession()
                    .createCriteria("OrderProduct")
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
      log.debug("finding OrderProduct instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from OrderProduct as model where model." 
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
		log.debug("finding all OrderProduct instances");
		try {
			String queryString = "from OrderProduct";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public OrderProduct merge(OrderProduct detachedInstance) {
        log.debug("merging OrderProduct instance");
        try {
            OrderProduct result = (OrderProduct) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(OrderProduct instance) {
        log.debug("attaching dirty OrderProduct instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(OrderProduct instance) {
        log.debug("attaching clean OrderProduct instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}