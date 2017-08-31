package com.sahiljalan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahiljalan.model.Customer;
import com.sahiljalan.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("We are inside constructor");
		this.customerRepository = customerRepository;
	}

	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are inside setter method");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.fineAll();
	}

}
