package com.okan.productservice.controller;

import com.okan.productservice.entity.BookDTO;
import com.okan.productservice.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Controller
@RequestMapping("api/book")
public class BookController {

  private final ProductService productService;

  @GetMapping("all")
  public ResponseEntity<List<BookDTO>> getlAllBook(){
    return ResponseEntity.ok(productService.getAllBook());
  }




}
