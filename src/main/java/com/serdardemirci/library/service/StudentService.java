package com.serdardemirci.library.service;

import com.serdardemirci.library.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    void add(Student student);
    Student getStudentByName(String name);
    List<Student> getStudents();

    Student getById(int studentId);
}
