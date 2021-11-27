package com.okan.productservice.entity.mapper;

import com.okan.productservice.entity.Book;
import com.okan.productservice.entity.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
  BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
  BookDTO bookToBookDTO(Book book);

}
