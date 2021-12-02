package com.serdardemirci.library.repo;

import com.serdardemirci.library.domain.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookTypeDao extends JpaRepository<BookType, Integer> {
    List<BookType> findBookTypesByName(String name);
}
