package com.fbuser.controller;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.facebookspringdao.IRegisterDao;
import com.pojos.Employee;
import com.pojos.SpringPojo;
import com.registerdao.RegisterDao;
import com.registerjdbcdao.RegisterJdbcDao;
import com.validations.validation;

@Controller
public class FbuserController {
	final static Logger logger = Logger.getLogger(FbuserController.class);
	// public String userRegister(Model model,@RequestParam("name")String name,
	// @RequestParam("city")54String city,

	@Autowired
	IRegisterDao dao;

	@RequestMapping(value = "/registerUser")
	public String userRegisterContoller(SpringPojo sp, Model model) {
		logger.info("hello");
		logger.info(sp.hashCode() + "  " + sp.getName() + " " + sp.getMob() + " " + sp.getMail() + " " + sp.getCity());

		try {
			logger.debug("validation begins here");
			boolean isvalid = validation.isValid(sp.getMob());
			if (!isvalid) {
				logger.debug("please enter valid mobile number");
				model.addAttribute("mobilemessage", "invalid mobile");
				return "register";
			}
			logger.debug("entered valid mobile");
			boolean validMail = validation.isValidMail(sp.getMail());
			if (!validMail) {
				model.addAttribute("mailmessage", "invalid mailid");
				logger.debug("please enter a valid email");
				return "register";
			}
			logger.debug("entered valid email" + sp.getMail());
			/*
			 * if(!isvalid || !validMail) { return "register"; }
			 */

			logger.info("validation successfully completed");

			// IRegisterDao dao=new RegisterDao();
			// IRegisterDao dao=new RegisterJdbcDao();
			dao.userRegister(sp);
			/*
			 * RegisterDao dao=new RegisterDao(); dao.userRegister(sp);
			 * RegisterJdbcDao dao=new RegisterJdbcDao(); dao.userRegister(sp);
			 */

			/*
			 * Configuration configure = new Configimplements
			 * IRegisterDaouration().configure("hibernate.cfg.xml");
			 * 
			 * @SuppressWarnings("deprecation") SessionFactory sessionFactory =
			 * configure.buildSessionFactory();
			 * logger.info("successfully build session factory");
			 * 
			 * //String s = null; //s.length(); Session session =
			 * sessionFactory.openSession(); logger.info("opened a session");
			 * session.save(sp); logger.info("parsed user data to database");
			 * session.beginTransaction().commit(); session.close();
			 */
		} catch (Exception e) {
			logger.error("exception occured", e);
			// e.printStackTrace();
			model.addAttribute("message", "something went wrong ");
			return "register";
		}

		logger.info("enter the details into db successful");
		logger.info("you entered details successfully");
		model.addAttribute("userName", sp.getName());
		return "login";

	}
}
