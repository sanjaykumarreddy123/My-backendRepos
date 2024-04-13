package com.Bankacount.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bankacount.entities.BankAccount;
import com.Bankacount.service.BankAccountService;
@CrossOrigin("*")
@RestController
public class BankAccountController {
	
	@Autowired
	BankAccountService service;
	
	@GetMapping("/account")
	public List<BankAccount> getAllBankAccountsInfo(){
		return service.getAllBankAccountsInfo();
	}
	@GetMapping("/account/{accountNum}")
	public BankAccount getBankAccountByAccountNum(@PathVariable ("accountNum") String accountNum) {
		return service.getBankAccountOfAccountNum(accountNum);
	}
	
	@PostMapping("/account")
	public BankAccount insertBankAccount(@RequestBody BankAccount bankAccount) {
		return service.insertBankAccount(bankAccount);
	}
	@PutMapping(value="/account/{accountNum}")
	public BankAccount updateBankAccount(@PathVariable("accountNum") String accountNum,@RequestBody BankAccount bankAccount) {
		return service.updateBankAccount(accountNum, bankAccount);
	}
	
	@DeleteMapping(value="/account/{accountNum}")
	public void deleteBankAccount(@PathVariable ("accountNum")String accountNum) {
		service.deleteBankAccount(accountNum);
	}
	
}
