// default package

import java.util.Date;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Suppliers entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Suppliers
  * @author MyEclipse Persistence Tools 
 */
public class SuppliersDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SuppliersDAO.class);
		//property constants
	public static final String ADMINISTRATOR_ID = "administratorId";
	public static final String USER_NAME = "userName";
	public static final String ADDRESS = "address";
	public static final String PHONE = "phone";
	public static final String TYPE = "type";
	public static final String POSTAL_CODE = "postalCode";
	public static final String REMARK = "remark";
	public static final String GROUPACTIVITY = "groupactivity";



    
    public void save(Suppliers transientInstance) {
        log.debug("saving Suppliers instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Suppliers persistentInstance) {
        log.debug("deleting Suppliers instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Suppliers findById( java.lang.String id) {
        log.debug("getting Suppliers instance with id: " + id);
        try {
            Suppliers instance = (Suppliers) getSession()
                    .get("Suppliers", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Suppliers instance) {
        log.debug("finding Suppliers instance by example");
        try {
            List results = getSession()
                    .createCriteria("Suppliers")
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
      log.debug("finding Suppliers instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Suppliers as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByAdministratorId(Object administratorId
	) {
		return findByProperty(ADMINISTRATOR_ID, administratorId
		);
	}
	
	public List findByUserName(Object userName
	) {
		return findByProperty(USER_NAME, userName
		);
	}
	
	public List findByAddress(Object address
	) {
		return findByProperty(ADDRESS, address
		);
	}
	
	public List findByPhone(Object phone
	) {
		return findByProperty(PHONE, phone
		);
	}
	
	public List findByType(Object type
	) {
		return findByProperty(TYPE, type
		);
	}
	
	public List findByPostalCode(Object postalCode
	) {
		return findByProperty(POSTAL_CODE, postalCode
		);
	}
	
	public List findByRemark(Object remark
	) {
		return findByProperty(REMARK, remark
		);
	}
	
	public List findByGroupactivity(Object groupactivity
	) {
		return findByProperty(GROUPACTIVITY, groupactivity
		);
	}
	

	public List findAll() {
		log.debug("finding all Suppliers instances");
		try {
			String queryString = "from Suppliers";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Suppliers merge(Suppliers detachedInstance) {
        log.debug("merging Suppliers instance");
        try {
            Suppliers result = (Suppliers) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Suppliers instance) {
        log.debug("attaching dirty Suppliers instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Suppliers instance) {
        log.debug("attaching clean Suppliers instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}