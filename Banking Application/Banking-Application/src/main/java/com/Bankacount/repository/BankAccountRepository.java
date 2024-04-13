package com.Bankacount.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Bankacount.entities.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,String>{
	
	@Query(value="select * from bank_account where account_num=?", nativeQuery=true)
	public BankAccount findByAccountNum(@Param("accountNum") String accountNum);
	
	@Query(value="delete from bank_account where accountNum=?",nativeQuery=true)
	public void delete(@Param("id") String id);
}


