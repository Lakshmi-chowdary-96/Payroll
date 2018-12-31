package com.cg.payroll.beans;

public class bankaccount {
	private int accountnumber, ifsccode;
	private String bankname;
	public bankaccount() {}
	public bankaccount(int accountnumber, int ifsccode, String bankname) {
		super();
		this.accountnumber = accountnumber;
		this.ifsccode = ifsccode;
		this.bankname = bankname;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(int ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
		
	

}
