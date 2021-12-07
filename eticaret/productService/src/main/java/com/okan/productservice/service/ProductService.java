package com.okan.productservice.service;

import com.okan.productservice.entity.BookDTO;
import java.util.List;
import org.springframework.stereotype.Service;

public interface ProductService {

  List<BookDTO> getAllBook();

}
