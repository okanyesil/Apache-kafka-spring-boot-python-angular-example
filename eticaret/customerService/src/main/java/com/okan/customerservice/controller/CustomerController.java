package com.okan.customerservice.controller;

import com.okan.customerservice.entity.CustomerDTO;
import com.okan.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@Controller
@RequestMapping("api/customer")
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping("info")
  public ResponseEntity<CustomerDTO> getCustomerInfo(@PathVariable CustomerDTO customerDTO){
    return ResponseEntity.ok(this.customerService.addNewCustomer(customerDTO));
  }

}
