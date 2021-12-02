package com.serdardemirci.library.service.impl;

import com.serdardemirci.library.domain.Book;
import com.serdardemirci.library.repo.BookDao;
import com.serdardemirci.library.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void add(Book book) {
        this.bookDao.save(book);
    }

    @Override
    public List<Book> getBooksByName(String name) {
        return this.bookDao.findBooksByName(name);
    }

    @Override
    public Book getBookById(int id) {
        return this.bookDao.getById(id);
    }
}
