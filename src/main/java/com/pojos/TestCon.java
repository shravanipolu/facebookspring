package com.pojos;

import org.apache.log4j.Logger;

public class TestCon {

	public static final Logger logger= Logger.getLogger( TestCon.class);
	public static void main(String[] args) {
		Passport p= new Passport();
		Employee e1=new Employee(p);
		 e1.setPprot(p);	
		 logger.info(e1.getEmpId() + "---" + e1.getEmpName() + "---" + e1.getEmpSalary() + "---" + e1.getEmpCompany()
			+ "---" + e1.getPprot().getPpId() + "----" + e1.getPprot().getPassportIssueCity()
			+ e1.getPprot().getpName() + "----" + e1.getPprot().getExpireDate() + "---"
			+ "---");
	
	
	
	}

 
 
}
