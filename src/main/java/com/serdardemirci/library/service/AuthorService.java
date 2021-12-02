package com.serdardemirci.library.service;

import com.serdardemirci.library.domain.Author;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    void add(Author author);
    Author getAuthorById(int id);
}
