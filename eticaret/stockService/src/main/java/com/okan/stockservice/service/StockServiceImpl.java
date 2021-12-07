package com.okan.stockservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class StockServiceImpl implements StockService{

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;


  @KafkaListener(topics = "order_event")
  @Override
  public void consumeOrderEvent(String message) {

    log.info("order event {}", message);

  }

  @Override
  public void produceStockCheckEvent(String message) {
    kafkaTemplate.send("stock_check", message);


  }
}
