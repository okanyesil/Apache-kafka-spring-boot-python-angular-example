package com.okan.productservice.service;

import com.okan.productservice.entity.BookDTO;

import com.okan.productservice.entity.mapper.BookMapper;
import com.okan.productservice.persistance.BookRepository;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Transactional
@Service
public class ProductServiceImpl implements ProductService{

  private final BookRepository bookRepository;
  private final BookMapper bookMapper = BookMapper.INSTANCE;

  @Override
  public List<BookDTO> getAllBook() {
    var allBooks = this.bookRepository.findAll();
    List<BookDTO> allBooksDto = allBooks.stream().map(bookMapper::bookToBookDTO).collect(Collectors.toList());
    return allBooksDto;
  }
}
