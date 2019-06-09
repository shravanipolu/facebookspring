package com.registerjdbcdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.facebookspringdao.ILoginDao;
import com.pojos.SpringPojo;
import com.registerdao.LoginDao;

public class LoginJdbcDao implements ILoginDao {
	public static final Logger logger=Logger.getLogger(LoginDao.class);
	public List<SpringPojo> getUserByUserNameAndPassword(String email, String pwd) throws ClassNotFoundException, SQLException {
		
		logger.info("Entered into getUserByUserNameAndPassword ::LoginJdbcDao ");
		List<SpringPojo> list = new ArrayList<SpringPojo>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded successfully");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springfb", "root",
				"shravani123");
		PreparedStatement prepareStatement = connection.prepareStatement("select * from user where mail=? and pwd=?");
		prepareStatement.setString(1, email);
		prepareStatement.setString(2, pwd);
		ResultSet resultSet = prepareStatement.executeQuery();

		while (resultSet.next()) {
			SpringPojo pojo = new SpringPojo();
			pojo.setName(resultSet.getString("name"));
			pojo.setMail(resultSet.getString("mail"));
			pojo.setPwd(resultSet.getString("pwd"));
			pojo.setCity(resultSet.getString("city"));
			pojo.setMob(resultSet.getString("mob"));
			list.add(pojo);
		}
		logger.info("Exiting from getUserByUserNameAndPassword ::LoginJdbcDao ");
		return list;
	
	}

	public List getAllUsers() {
		logger.info("Entered into getUserByUserNameAndPassword ::LoginJdbcDao ");
		List<SpringPojo> list = new ArrayList();
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded successfully");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springfb", "root",
				"shravani123");
		PreparedStatement prepareStatement = connection.prepareStatement("select * from user");
		ResultSet resultSet = prepareStatement.executeQuery();

		while (resultSet.next()) {
			SpringPojo pojo = new SpringPojo();
			pojo.setName(resultSet.getString("name"));
			pojo.setMail(resultSet.getString("mail"));
			pojo.setPwd(resultSet.getString("pwd"));
			pojo.setCity(resultSet.getString("city"));
			pojo.setMob(resultSet.getString("mob"));
			list.add(pojo);
		}
		
		}	catch(Exception e){
		e.printStackTrace();
		
		}
	logger.info("Exiting from getUserByUserNameAndPassword ::LoginJdbcDao ");
		return list;
	}
}
