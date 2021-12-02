package com.serdardemirci.library.service;

import com.serdardemirci.library.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void add(Book book);
    List<Book> getBooksByName(String name);
    Book getBookById(int id);
}
