package com.okan.orderservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
  private Long id;
  private String bookName;
  private String author;
  private float price;

}
