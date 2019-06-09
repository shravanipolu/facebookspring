package com.registerdao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.facebookspringdao.IRegisterDao;
import com.fbuser.controller.FbuserController;
import com.pojos.SpringPojo;

public class RegisterDao implements IRegisterDao {
	final static Logger logger = Logger.getLogger(FbuserController.class);

	public void userRegister(SpringPojo user) {

		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = configure.buildSessionFactory();
		logger.info("successfully build session factory");

		Session session = sessionFactory.openSession();
		logger.info("opened a session");
		session.save(user);
		logger.info("parsed user data to database");
		session.beginTransaction().commit();
		session.close();

	}
}
