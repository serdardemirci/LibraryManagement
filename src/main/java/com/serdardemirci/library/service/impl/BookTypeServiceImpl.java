package com.serdardemirci.library.service.impl;

import com.serdardemirci.library.domain.BookType;
import com.serdardemirci.library.repo.BookTypeDao;
import com.serdardemirci.library.service.BookTypeService;

import java.util.List;

public class BookTypeServiceImpl implements BookTypeService {

    private final BookTypeDao bookTypeDao;

    public BookTypeServiceImpl(BookTypeDao bookTypeDao) {
        this.bookTypeDao = bookTypeDao;
    }

    @Override
    public void add(BookType bookType) {
        this.bookTypeDao.save(bookType);
    }

    @Override
    public List<BookType> getBookTypesByName(String name) {
        return this.bookTypeDao.findBookTypesByName(name);
    }

    @Override
    public BookType getBookTypeById(int id) {
        return this.bookTypeDao.getById(id);
    }
}
