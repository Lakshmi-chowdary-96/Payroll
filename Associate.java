package com.cg.payroll.beans;

public class Associate {
	private int associateID,yearlyInvestmmentUnder80C;
	private String firstName,lastName,department,designation,pancard,emailId;
	public Associate() {}
	public Associate(int associateID, int yearlyInvestmmentUnder80C, String firstName, String lastName,
			String department, String designation, String pancard, String emailId) {
		super();
		this.associateID = associateID;
		this.yearlyInvestmmentUnder80C = yearlyInvestmmentUnder80C;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
	}
	public int getAssociateID() {
		return associateID;
	}
	public void setAssociateID(int associateID) {
		this.associateID = associateID;
	}
	public int getYearlyInvestmmentUnder80C() {
		return yearlyInvestmmentUnder80C;
	}
	public void setYearlyInvestmmentUnder80C(int yearlyInvestmmentUnder80C) {
		this.yearlyInvestmmentUnder80C = yearlyInvestmmentUnder80C;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
		
	

}
