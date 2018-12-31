package com.cg.payroll.beans;

public class Salary{
	private int basicsalary,hra,conveyenceallowance,otherAllowance,personalAllowance,otherAlowance,PersonalAllowance,monthlyTax,epf,companyPf,gratiurity,grosssalary,netsalary;
	public Salary() {}
	public Salary(int basicsalary, int hra, int conveyenceallowance, int otherAllowance, int personalAllowance,
			int otherAlowance, int personalAllowance2, int monthlyTax, int epf, int companyPf, int gratiurity,
			int grosssalary, int netsalary) {
		super();
		this.basicsalary = basicsalary;
		this.hra = hra;
		this.conveyenceallowance = conveyenceallowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.otherAlowance = otherAlowance;
		PersonalAllowance = personalAllowance2;
		this.monthlyTax = monthlyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.gratiurity = gratiurity;
		this.grosssalary = grosssalary;
		this.netsalary = netsalary;
	}
	public int getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getConveyenceallowance() {
		return conveyenceallowance;
	}
	public void setConveyenceallowance(int conveyenceallowance) {
		this.conveyenceallowance = conveyenceallowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getPersonalAllowance() {
		return personalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}
	public int getOtherAlowance() {
		return otherAlowance;
	}
	public void setOtherAlowance(int otherAlowance) {
		this.otherAlowance = otherAlowance;
	}
	public int getPersonalAllowance() {
		return PersonalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		PersonalAllowance = personalAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	public int getCompanyPf() {
		return companyPf;
	}
	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}
	public int getGratiurity() {
		return gratiurity;
	}
	public void setGratiurity(int gratiurity) {
		this.gratiurity = gratiurity;
	}
	public int getGrosssalary() {
		return grosssalary;
	}
	public void setGrosssalary(int grosssalary) {
		this.grosssalary = grosssalary;
	}
	public int getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(int netsalary) {
		this.netsalary = netsalary;
	}
		
	
}
	
