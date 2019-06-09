package com.fbuser.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.facebookspringdao.ILoginDao;
import com.pojos.SpringPojo;
import com.registerdao.LoginDao;

@Controller
public class UserController {
	@RequestMapping(value="/deleteUser",method=RequestMethod.POST)
public String deleteUserInformation(@RequestParam("mailIdToDelete") String email,Model model){
System.out.println("delte user triggered" +email);
Configuration configure = new Configuration().configure();
SessionFactory sessionFactory = configure.buildSessionFactory();
Session session = sessionFactory.openSession();
Query query = session.createQuery("delete from SpringPojo where mail=:mailId");
query.setParameter("mailId", email);
query.executeUpdate();
session.beginTransaction().commit();
Query display = session.createQuery("from SpringPojo");
List<SpringPojo> list = display.list();
model.addAttribute("userList", list);
session.close();
	return"profie1";
}

	@RequestMapping(value="/editView")
	public String editController(@RequestParam("mailIdToEdit") String mailId,Model model){
		System.out.println("edit controller for" +mailId+"is triggered");
		Configuration configure = new Configuration().configure();
		SessionFactory sessionFactory = configure.buildSessionFactory();
		Session session = sessionFactory.openSession();
Query query = session.createQuery("from SpringPojo where mail=:email");
query.setParameter("email",mailId);
		List<SpringPojo> list = query.list();
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getMail());
		System.out.println(list.get(0).getMob());
		
		model.addAttribute("editList", list.get(0));
		session.beginTransaction().commit();
		session.close();
		
	return "editUser";	
	}
	@RequestMapping(value="/updateUser")
	public String updateController(SpringPojo sj,Model model){
		System.out.println("update triggered for  "+sj.getMail());
		System.out.println(sj.getName());
		System.out.println(sj.getMob());
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.update(sj);
		session.beginTransaction().commit();

		Query display = session.createQuery("from SpringPojo");
		List<SpringPojo> list = display.list();
		model.addAttribute("userList", list);
		
			
		session.close();
		return "profie1";
	}
	@RequestMapping(value="/fetchAllRecords")
	public String fetchAllRecords(Model m){
		ILoginDao dao=new LoginDao();
		List<SpringPojo> allUsers = dao.getAllUsers();
		m.addAttribute("userList",allUsers );
		
		return "profie1";
	}
	
	
	
}
