package com.okan.stockservice.service;

public interface StockService {

  void consumeOrderEvent(String message);
  void produceStockCheckEvent(String message);

}
