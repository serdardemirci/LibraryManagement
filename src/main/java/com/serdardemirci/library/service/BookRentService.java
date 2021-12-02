package com.serdardemirci.library.service;

import com.serdardemirci.library.domain.BookRent;
import org.springframework.stereotype.Service;

@Service
public interface BookRentService {
    BookRent rentBook(BookRent bookRent);
}
