package com.serdardemirci.library.service.impl;

import com.serdardemirci.library.domain.Author;
import com.serdardemirci.library.repo.AuthorDao;
import com.serdardemirci.library.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public void add(Author author) {
        this.authorDao.save(author);
    }

    @Override
    public Author getAuthorById(int id) {
        return this.authorDao.getById(id);
    }
}
