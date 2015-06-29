package portal.school.common.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * 
 * @author Kavali.Kiran
 *
 */
/**
 * this class is the master DAO class for school portal.
 * it provides the session factory and session objects for its child classes
 */
public class SchoolPortalDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public final SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public final Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
}
