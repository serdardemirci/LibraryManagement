package com.serdardemirci.library.service.impl;

import com.serdardemirci.library.domain.Book;
import com.serdardemirci.library.domain.BookRent;
import com.serdardemirci.library.domain.Student;
import com.serdardemirci.library.repo.BookRentDao;
import com.serdardemirci.library.service.BookRentService;
import com.serdardemirci.library.service.BookService;
import com.serdardemirci.library.service.StudentService;

public class BookRentServiceImpl implements BookRentService {

    private final BookRentDao bookRentDao;
    private final BookService bookService;
    private final StudentService studentService;

    public BookRentServiceImpl(BookRentDao bookRentDao, BookService bookService, StudentService studentService) {
        this.bookRentDao = bookRentDao;
        this.bookService = bookService;
        this.studentService = studentService;
    }

    @Override
    public BookRent rentBook(BookRent bookRent) {

        //Book book = this.bookService.getBookById(bookRent.getBookId().getId());
        //Student student = this.studentService.getById(bookRent.getStudentId().getId());

        return this.bookRentDao.save(bookRent);
    }
}
