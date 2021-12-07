package com.okan.orderservice.service;

import com.okan.orderservice.Entity.OrderDTO;

public interface OrderService {

  void kafkaListenOrders(String message);
  void produceOrderEvent();
  OrderDTO createAnOrder(OrderDTO orderDTO);

}
