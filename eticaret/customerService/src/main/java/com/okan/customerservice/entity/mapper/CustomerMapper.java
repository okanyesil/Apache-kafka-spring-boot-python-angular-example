package com.okan.customerservice.entity.mapper;

import com.okan.customerservice.entity.Customer;
import com.okan.customerservice.entity.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
  CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
  CustomerDTO CustomerToCustomerDto(Customer customer);

}
