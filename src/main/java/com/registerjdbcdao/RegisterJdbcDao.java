package com.registerjdbcdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.facebookspringdao.IRegisterDao;
import com.fbuser.controller.FbuserController;
import com.pojos.SpringPojo;

public class RegisterJdbcDao implements IRegisterDao {
	final static Logger logger = Logger.getLogger(FbuserController.class);

	public void userRegister(SpringPojo user) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded successfully");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springfb", "root",
				"shravani123");
		logger.info("connection opened into jdbc");

		PreparedStatement ps = connection.prepareStatement("insert into user(name,mob,mail,city,pwd,role)values(?,?,?,?,?,?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getMob());
		ps.setString(3, user.getMail());
		ps.setString(4, user.getCity());
		ps.setString(5, user.getPwd());
		ps.setString(6, user.getRole());
		ps.executeUpdate();
		logger.info("values inserted into database successfully");
		connection.close();
		logger.info("connection closed from jdbc");

	}
}
