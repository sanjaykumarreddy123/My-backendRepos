package com.Bankacount.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
	String accountHolderName;
	@Id
	String accountNum;
	String bankName;
	String iFSCNum;
	String location;
	String accountHolderMobileNum;
	String accountHolderEmail;
	String panNum;
	long aadharNum;
	public BankAccount() {
		super();
	}
	public BankAccount(String accountHolderName, String accountNum, String bankName, String iFSCNum, String location,
			String accountHolderMobileNum, String accountHolderEmail, String panNum, long aadharNum) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNum = accountNum;
		this.bankName = bankName;
		this.iFSCNum = iFSCNum;
		this.location = location;
		this.accountHolderMobileNum = accountHolderMobileNum;
		this.accountHolderEmail = accountHolderEmail;
		this.panNum = panNum;
		this.aadharNum = aadharNum;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIFSCNum() {
		return iFSCNum;
	}
	public void setIFSCNum(String iFSCNum) {
		this.iFSCNum = iFSCNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAccountHolderMobileNum() {
		return accountHolderMobileNum;
	}
	public void setAccountHolderMobileNum(String accountHolderMobileNum) {
		this.accountHolderMobileNum = accountHolderMobileNum;
	}
	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}
	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}
	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName + ", accountNum=" + accountNum + ", bankName="
				+ bankName + ", IFSCNum=" + iFSCNum + ", location=" + location + ", accountHolderMobileNum="
				+ accountHolderMobileNum + ", accountHolderEmail=" + accountHolderEmail + ", panNum=" + panNum
				+ ", aadharNum=" + aadharNum + "]";
	}
	public BankAccount get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
