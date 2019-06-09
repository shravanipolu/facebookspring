package com.registerdao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.facebookspringdao.ILoginDao;
import com.pojos.SpringPojo;

public class LoginDao implements ILoginDao {
	
public static final Logger logger=Logger.getLogger(LoginDao.class);	
	
public List getUserByUserNameAndPassword(String email, String pwd){
logger.info("Entered into getUserByUserNameAndPassword ::LoginDao ");
	Configuration configure = new Configuration().configure("hibernate.cfg.xml");
	@SuppressWarnings("deprecation")
	SessionFactory sessionFactory = configure.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Query query = session.createQuery("from SpringPojo where mail=:mailid and pwd=:password");
	query.setParameter("mailid", email);
	query.setParameter("password", pwd);
	List list = query.list();
	session.close();
	logger.info("Exiting from getUserByUserNameAndPassword ::LoginDao ");
	return list;
}
public List getAllUsers(){
	logger.info("Entered into getAllUsers::LoginDao ");
	Configuration configure = new Configuration().configure("hibernate.cfg.xml");
	@SuppressWarnings("deprecation")
	SessionFactory sessionFactory = configure.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Query query2 = session.createQuery("from SpringPojo");
	List<SpringPojo> uList = query2.list();

	session.close();
	logger.info("Exiting from getAllUsers ::LoginDao ");
	
	return uList;
}


}
