package com.pojos;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import javafx.beans.DefaultProperty;
@Repository
public class Employee {
	final static Logger logger=Logger.getLogger(Employee.class);
private int empId;
private String empName;
private String empSalary;
private String empCompany;
//@Autowired
private Passport pprot;


public Employee(){
	logger.info("default empty constructor");
}

public Employee(Passport p){
	this.pprot=p;
	logger.info("employee constructor with Passport ");
}





private Address add;

public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public Passport getPprot() {
	return pprot;
}
public void setPprot(Passport pprot) {
	this.pprot = pprot;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(String empSalary) {
	this.empSalary = empSalary;
}
public String getEmpCompany() {
	return empCompany;
}
public void setEmpCompany(String empCompany) {
	this.empCompany = empCompany;
}




}
