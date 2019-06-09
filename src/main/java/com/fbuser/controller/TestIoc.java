package com.fbuser.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojos.Employee;

@Controller
public class TestIoc {
final static Logger logger=Logger.getLogger(TestIoc.class);
	// @Qualifier(value = "jdaEmp")
	//@Autowired
	Employee e1;

	// @Qualifier(value = "jdaEmp")
	//@Autowired
	Employee e2;

	// @Qualifier(value = "ctsEmp")
	//@Autowired
	Employee e3;

	// @Qualifier(value = "ctsEmp")
	//@Autowired
	Employee e4;

	@RequestMapping(value = "/value")
	public void user() {

		/*logger.info("employee details are before set the value");
		logger.info(e1.getEmpId() + "---" + e1.getEmpName() + "---" + e1.getEmpSalary() + "---" + e1.getEmpCompany()
				+ "---" + e1.getPprot().getPpId() + "----" + e1.getPprot().getPassportIssueCity()
				+ e1.getPprot().getpName() + "----" + e1.getPprot().getExpireDate() + "---"
				+ e1.getPprot().getAdd().getHouseNumber() + "--" + e1.getPprot().getAdd().getStreetName() + "---"
				+ e1.getPprot().getAdd().getCity() + "---");
		logger.info(e2.getEmpId() + "---" + e2.getEmpName() + "---" + e2.getEmpSalary() + "---" + e2.getEmpCompany()
				+ "--" + e2.getPprot().getPpId() + "----" + e2.getPprot().getPassportIssueCity()
				+ e2.getPprot().getpName() + "----" + e2.getPprot().getExpireDate() + "---"
				+ e2.getPprot().getAdd().getHouseNumber() + "--" + e2.getPprot().getAdd().getStreetName() + "---"
				+ e2.getPprot().getAdd().getCity() + "---");

*/		e1.setEmpId(100);
		e1.setEmpName("shravani");
		e1.setEmpSalary("25000");
		// e1.setEmpCompany("JDA");
		e1.getPprot().setPpId(1234);
		e1.getPprot().setpName("shrvani");
		e1.getPprot().setPassportIssueCity("Chennai");
		e1.getPprot().setExpireDate("jan 2023");

		e1.getPprot().getAdd().setHouseNumber("10-4-3");
		e1.getPprot().getAdd().setStreetName("indira nagar");
		e1.getPprot().getAdd().setCity("sircilla");
/*		logger.info("employee details are after set for emp 1");
		logger.info(e1.getEmpId() + "---" + e1.getEmpName() + "---" + e1.getEmpSalary() + "---" + e1.getEmpCompany()
				+ "---" + e1.getPprot().getPpId() + "----" + e1.getPprot().getPassportIssueCity()
				+ e1.getPprot().getpName() + "----" + e1.getPprot().getExpireDate() + "---"
				+ e1.getPprot().getAdd().getHouseNumber() + "--" + e1.getPprot().getAdd().getStreetName() + "---"
				+ e1.getPprot().getAdd().getCity() + "---");
		logger.info(e2.getEmpId() + "---" + e2.getEmpName() + "---" + e2.getEmpSalary() + "---" + e2.getEmpCompany()
				+ "--" + e2.getPprot().getPpId() + "----" + e2.getPprot().getPassportIssueCity()
				+ e2.getPprot().getpName() + "----" + e2.getPprot().getExpireDate() + "---"
				+ e2.getPprot().getAdd().getHouseNumber() + "--" + e2.getPprot().getAdd().getStreetName() + "---"
				+ e2.getPprot().getAdd().getCity() + "---");

*/		e2.setEmpId(101);
		e2.setEmpName("bhavani");
		e2.setEmpSalary("20000");
		// e2.setEmpCompany("JDA");
		e2.getPprot().setPpId(5461);
		e2.getPprot().setpName("bhavani");
		e2.getPprot().setPassportIssueCity("Chennai");
		e2.getPprot().setExpireDate("jan 2023");

		e2.getPprot().getAdd().setHouseNumber("11-5-3");
		e2.getPprot().getAdd().setStreetName("ganesh nagar");
		e2.getPprot().getAdd().setCity("sircilla");

		logger.info("employee details are after set values for emp2");
		logger.info(e1.getEmpId() + "---" + e1.getEmpName() + "---" + e1.getEmpSalary() + "---"
				+ e1.getEmpCompany() + "---" + e1.getPprot().getPpId() + "----" + e1.getPprot().getPassportIssueCity()
				+ e1.getPprot().getpName() + "----" + e1.getPprot().getExpireDate() + "---"
				+ e1.getPprot().getAdd().getHouseNumber() + "--" + e1.getPprot().getAdd().getStreetName() + "---"
				+ e1.getPprot().getAdd().getCity() + "---");
		logger.info(e2.getEmpId() + "---" + e2.getEmpName() + "---" + e2.getEmpSalary() + "---"
				+ e2.getEmpCompany() + "--" + e2.getPprot().getPpId() + "----" + e2.getPprot().getPassportIssueCity()
				+ e2.getPprot().getpName() + "----" + e2.getPprot().getExpireDate() + "---"
				+ e2.getPprot().getAdd().getHouseNumber() + "--" + e2.getPprot().getAdd().getStreetName() + "---"
				+ e2.getPprot().getAdd().getCity() + "---");

	}

}
