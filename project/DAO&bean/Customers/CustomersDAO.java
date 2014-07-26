// default package

import java.util.Date;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Customers entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .Customers
  * @author MyEclipse Persistence Tools 
 */
public class CustomersDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(CustomersDAO.class);
		//property constants
	public static final String CUSTOMER_NAME = "customerName";
	public static final String REAL_NAME = "realName";
	public static final String PASSWORD = "password";
	public static final String SEX = "sex";
	public static final String QUESTION = "question";
	public static final String ANSWER = "answer";
	public static final String EMAIL = "email";
	public static final String ADDRESS = "address";
	public static final String POSTAL_CODE = "postalCode";
	public static final String PHONE = "phone";
	public static final String FAX = "fax";
	public static final String INTEGRAL = "integral";



    
    public void save(Customers transientInstance) {
        log.debug("saving Customers instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Customers persistentInstance) {
        log.debug("deleting Customers instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Customers findById( java.lang.String id) {
        log.debug("getting Customers instance with id: " + id);
        try {
            Customers instance = (Customers) getSession()
                    .get("Customers", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Customers instance) {
        log.debug("finding Customers instance by example");
        try {
            List results = getSession()
                    .createCriteria("Customers")
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
      log.debug("finding Customers instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Customers as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByCustomerName(Object customerName
	) {
		return findByProperty(CUSTOMER_NAME, customerName
		);
	}
	
	public List findByRealName(Object realName
	) {
		return findByProperty(REAL_NAME, realName
		);
	}
	
	public List findByPassword(Object password
	) {
		return findByProperty(PASSWORD, password
		);
	}
	
	public List findBySex(Object sex
	) {
		return findByProperty(SEX, sex
		);
	}
	
	public List findByQuestion(Object question
	) {
		return findByProperty(QUESTION, question
		);
	}
	
	public List findByAnswer(Object answer
	) {
		return findByProperty(ANSWER, answer
		);
	}
	
	public List findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	
	public List findByAddress(Object address
	) {
		return findByProperty(ADDRESS, address
		);
	}
	
	public List findByPostalCode(Object postalCode
	) {
		return findByProperty(POSTAL_CODE, postalCode
		);
	}
	
	public List findByPhone(Object phone
	) {
		return findByProperty(PHONE, phone
		);
	}
	
	public List findByFax(Object fax
	) {
		return findByProperty(FAX, fax
		);
	}
	
	public List findByIntegral(Object integral
	) {
		return findByProperty(INTEGRAL, integral
		);
	}
	

	public List findAll() {
		log.debug("finding all Customers instances");
		try {
			String queryString = "from Customers";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Customers merge(Customers detachedInstance) {
        log.debug("merging Customers instance");
        try {
            Customers result = (Customers) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Customers instance) {
        log.debug("attaching dirty Customers instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Customers instance) {
        log.debug("attaching clean Customers instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}