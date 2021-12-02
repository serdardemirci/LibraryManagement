package com.serdardemirci.library.service;

import com.serdardemirci.library.domain.BookType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookTypeService {
    void add(BookType bookType);
    List<BookType> getBookTypesByName(String name);
    BookType getBookTypeById(int id);
}
