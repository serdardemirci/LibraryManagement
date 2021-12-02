package com.serdardemirci.library.repo;

import com.serdardemirci.library.domain.BookRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRentDao extends JpaRepository<BookRent, Integer> {
}
