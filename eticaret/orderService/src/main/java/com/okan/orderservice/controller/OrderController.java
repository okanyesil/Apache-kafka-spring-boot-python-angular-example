package com.okan.orderservice.controller;


import com.okan.orderservice.Entity.OrderDTO;
import com.okan.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("api/order")
public class OrderController {

  private final OrderService orderService;

  @PostMapping("create")
  public ResponseEntity<OrderDTO> createAnOrder(@PathVariable OrderDTO orderDTO){
    return ResponseEntity.ok(orderService.createAnOrder(orderDTO));
  }



}
