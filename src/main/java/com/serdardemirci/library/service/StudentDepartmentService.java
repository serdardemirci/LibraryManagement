package com.serdardemirci.library.service;

import com.serdardemirci.library.domain.StudentDepartment;
import org.springframework.stereotype.Service;

@Service
public interface StudentDepartmentService {
    void add(StudentDepartment studentDepartment);
    StudentDepartment getStudentDepartmentById(int id);
}
