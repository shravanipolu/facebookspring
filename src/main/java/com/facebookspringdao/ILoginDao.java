package com.facebookspringdao;

import java.util.List;

import com.pojos.SpringPojo;

public interface ILoginDao {
	public List<SpringPojo> getUserByUserNameAndPassword(String email, String pwd) throws Exception;
	
	public List<SpringPojo> getAllUsers();
}
