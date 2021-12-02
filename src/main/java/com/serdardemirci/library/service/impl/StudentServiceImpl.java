package com.serdardemirci.library.service.impl;

import com.serdardemirci.library.domain.Student;
import com.serdardemirci.library.repo.StudentDao;
import com.serdardemirci.library.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void add(Student student) {
        this.studentDao.save(student);
    }

    @Override
    public Student getStudentByName(String name) {
        return this.studentDao.findByName(name);
    }

    @Override
    public List<Student> getStudents() {
        return this.studentDao.findAll();
    }

    @Override
    public Student getById(int studentId) {
        return this.studentDao.getById(studentId);
    }
}
