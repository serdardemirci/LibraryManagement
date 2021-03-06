package com.serdardemirci.library.repo;

import com.serdardemirci.library.domain.StudentDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDepartmentDao extends JpaRepository<StudentDepartment, Integer> {
}
