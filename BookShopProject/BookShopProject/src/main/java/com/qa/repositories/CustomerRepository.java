package com.qa.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.qa.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	@Modifying
	@Transactional
	@Query("SELECT c from Customer c where c.email like %:email%")
	public Iterable<Customer> getCustomerByEmail(@Param("email")String email);

	@Query("SELECT c from Customer c where c.password like %:password%")
	public Iterable<Customer> getCustomerByPassword(@Param("password")String password);
	
	@Query("SELECT c from Customer c where c.email = :email and c.password = :password")
	public Customer verifyEmailAndPassword(@Param("email")String email, @Param("password")String password);
	
}
