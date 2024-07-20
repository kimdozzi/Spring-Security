package com.example.springsecuritybasic.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, String> {
	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(long customerId);
}
