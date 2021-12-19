package com.okan.orderservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class newOrder {

  private CustomerDTO customerDTO;
  private OrderDTO orderDTO;

}
