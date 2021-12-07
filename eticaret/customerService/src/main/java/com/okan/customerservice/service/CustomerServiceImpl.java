package com.okan.customerservice.service;

import com.okan.customerservice.entity.Customer;
import com.okan.customerservice.entity.CustomerDTO;
import com.okan.customerservice.persistance.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

  private final CustomerRepository customerRepository;

  @Override
  public CustomerDTO addNewCustomer(CustomerDTO customerDTO) {
    Customer newCustomer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getLastName(), customerDTO.getEmail());
    customerRepository.save(newCustomer);
    return customerDTO;
  }
}
