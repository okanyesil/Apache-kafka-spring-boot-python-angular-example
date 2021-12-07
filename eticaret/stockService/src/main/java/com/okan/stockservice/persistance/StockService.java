package com.okan.stockservice.persistance;

import com.okan.stockservice.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockService extends JpaRepository<Stock,Long> {

}
