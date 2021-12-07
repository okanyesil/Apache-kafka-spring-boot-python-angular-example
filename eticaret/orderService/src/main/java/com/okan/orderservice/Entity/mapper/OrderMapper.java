package com.okan.orderservice.Entity.mapper;

import com.okan.orderservice.Entity.Order;
import com.okan.orderservice.Entity.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
  OrderMapper orderMapper= Mappers.getMapper(OrderMapper.class);

  OrderDTO orderToOrderDto(Order order);

}
