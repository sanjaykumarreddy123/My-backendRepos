package com.Bankacount.service;

import java.util.List;

import com.Bankacount.entities.BankAccount;

public interface BankAccountServiceInterface {
	public List<BankAccount> getAllBankAccountsInfo();
	public BankAccount getBankAccountOfAccountNum(String accountNum);
	public BankAccount insertBankAccount(BankAccount bankAccount);
	public BankAccount updateBankAccount(String accountNum,BankAccount bankAccount);
	public void deleteBankAccount(String accountNum);
}
