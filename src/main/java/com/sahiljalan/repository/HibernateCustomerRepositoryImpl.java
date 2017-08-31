package com.sahiljalan.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sahiljalan.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.sahiljalan.repository.CustomerRepository#fineAll()
	 */
	@Override
	public List<Customer> fineAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Sahil");
		customer.setLastName("Jalan");
		
		customers.add(customer);
		
		return customers;

	}
}
