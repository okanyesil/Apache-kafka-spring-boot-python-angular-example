package com.okan.orderservice.service;

import com.okan.orderservice.Entity.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService{

  @Autowired
  private KafkaTemplate<String,String> kafkaTemplate;



  @KafkaListener(topics = "payment_event")
  @Override
  public void kafkaListenOrders(String message) {
    log.info(message);

  }

  @Override
  public void produceOrderEvent() {

    kafkaTemplate.send("order_event","başarılı");
  }

  @Override
  public OrderDTO createAnOrder(OrderDTO orderDTO){
    log.info("Order {}", orderDTO);
    return null;
  }


}
