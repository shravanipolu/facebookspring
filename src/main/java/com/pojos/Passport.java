package com.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Passport {

	private Integer ppId;
	private String passportIssueCity;
	private String pName;
	private String expireDate;
//@Autowired
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Integer getPpId() {
		return ppId;
	}

	public void setPpId(Integer ppId) {
		this.ppId = ppId;
	}

	public String getPassportIssueCity() {
		return passportIssueCity;
	}

	public void setPassportIssueCity(String passportIssueCity) {
		this.passportIssueCity = passportIssueCity;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

}
