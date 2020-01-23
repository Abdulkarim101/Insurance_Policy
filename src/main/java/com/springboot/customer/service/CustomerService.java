package com.springboot.customer.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.customer.repository.CustomerRepository;
import com.springboot.customerDto.CustomerDto;
import com.springboot.customerEntity.CustomerEntity;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerDto createCustomer(CustomerDto dto) {

		CustomerEntity cust = null;
		if (dto != null) {
			cust = new CustomerEntity();
			cust.setfName(dto.getfName());
			cust.setlName(dto.getlName());
			cust.setEmail(dto.getEmail());
			cust.setPhone(dto.getPhone());
			cust.setIsActive(dto.getIsActive());
			cust.setCreatedAt(dto.getCreatedAt());
			cust.setUpdatedAat(dto.getUpdatedAt());

			cust.setuUID(UUID.randomUUID().toString());

			
			

		}
		customerRepository.save(cust);
		return dto;
	}
}
