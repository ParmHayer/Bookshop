package com.qa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.models.Customer;
import com.qa.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer createCustomerRecord(Customer c)
	{
		return customerRepository.save(c); 
	}
	
	public Iterable<Customer> getAllCustomersByEmail(String email)
	{
		return customerRepository.getCustomerByEmail(email);
	}

	public Iterable<Customer> getAllCustomersByPassword(String password)
	{
		return customerRepository.getCustomerByPassword(password);
	}
	
	public Customer checkEmailAndPassword(String email, String password)
	{
		return customerRepository.verifyEmailAndPassword(email, password);
	}


}

//public void createCustomerRecord(Customer c) {
//// TODO Auto-generated method stub
//
//}