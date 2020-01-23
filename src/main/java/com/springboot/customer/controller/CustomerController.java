package com.springboot.customer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.customer.repository.CustomerRepository;
import com.springboot.customer.service.CustomerService;
import com.springboot.customerDto.CustomerDto;
import com.springboot.customerEntity.CustomerEntity;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomerRepository repo;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public CustomerDto createCustomer(@RequestBody CustomerDto dto) {

		return customerService.createCustomer(dto);	

	}
	@GetMapping("/id/{id}")
	public Optional<CustomerEntity> getById(@PathVariable Integer id) {
		return repo.findById(id);
		
	}

}
