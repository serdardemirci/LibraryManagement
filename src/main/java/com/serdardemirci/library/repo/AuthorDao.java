package com.serdardemirci.library.repo;

import com.serdardemirci.library.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer> {
}
