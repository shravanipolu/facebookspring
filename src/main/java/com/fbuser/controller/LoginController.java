package com.fbuser.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.facebookspringdao.ILoginDao;
import com.registerdao.LoginDao;
import com.registerjdbcdao.LoginJdbcDao;

@Controller
public class LoginController {

	//@Autowired
	//ILoginDao logDao;

	@RequestMapping(value = "/loginUser")
	public String login(@RequestParam("mail") String email, @RequestParam("pwd") String pwd, Model model)
			throws Exception {

		 //LoginDao logDao=new LoginDao();
		ILoginDao  logDao=  new LoginDao();
		/*
		 * Configuration configure = new
		 * Configuration().configure("hibernate.cfg.xml");
		 * 
		 * @SuppressWarnings("deprecation") SessionFactory sessionFactory =
		 * configure.buildSessionFactory(); Session session =
		 * sessionFactory.openSession(); Query query = session.
		 * createQuery("from SpringPojo where mail=:mailid and pwd=:password");
		 * query.setParameter("mailid", email); query.setParameter("password",
		 * pwd); List list = query.list();
		 */

		List list = logDao.getUserByUserNameAndPassword(email, pwd);
		if (list.isEmpty()) {
			System.out.println("invalid credentials");
			model.addAttribute("user", email);
			return "login";
		} else {
			model.addAttribute("user", email);
			System.out.println("valid credentials");
			/*
			 * Query query2 = session.createQuery("from SpringPojo");
			 * List<SpringPojo> uList = query2.list();
			 */

			/*
			 * for (SpringPojo springPojo : uList) {
			 * System.out.println(springPojo.getName() + springPojo.getMail() +
			 * springPojo.getCity());
			 * 
			 * }
			 */
			/*List uList = logDao.getAllUsers();
			model.addAttribute("userList", uList);

			model.addAttribute("msg", "ravi go to office");*/
			return "success";
}
		}

	}
	
