package com.Bankacount.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bankacount.entities.BankAccount;
import com.Bankacount.repository.BankAccountRepository;


@Service
public class BankAccountService implements BankAccountServiceInterface{
	
	@Autowired
	BankAccountRepository repository;
	
	@Override
	public List<BankAccount> getAllBankAccountsInfo() {
		return repository.findAll();
	}

	@Override
	public BankAccount getBankAccountOfAccountNum(String accountNum) {
		return repository.findById(accountNum).get();
	}

	@Override
	public BankAccount insertBankAccount(BankAccount bankAccount) {
		return repository.save(bankAccount);
	}

	@Override
	public BankAccount updateBankAccount(String accountNum,BankAccount bankAccount) {
		BankAccount acc = repository.findByAccountNum(accountNum).get();
		acc.setAccountHolderName(bankAccount.getAccountHolderName());
		acc.setAccountNum(bankAccount.getAccountNum());
		acc.setBankName(bankAccount.getBankName());
		acc.setIFSCNum(bankAccount.getIFSCNum());
		acc.setLocation(bankAccount.getLocation());
		acc.setAccountHolderMobileNum(bankAccount.getAccountHolderMobileNum());
		acc.setAccountHolderEmail(bankAccount.getAccountHolderEmail());
		acc.setPanNum(bankAccount.getPanNum());
		acc.setAadharNum(bankAccount.getAadharNum());
		return repository.save(acc);
	}

	@Override
	public void deleteBankAccount(String accountNum) {
		BankAccount ba = repository.findById(accountNum).get();
		repository.delete(ba); 		
	}

}
