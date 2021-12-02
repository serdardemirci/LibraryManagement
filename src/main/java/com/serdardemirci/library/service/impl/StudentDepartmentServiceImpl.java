package com.serdardemirci.library.service.impl;

import com.serdardemirci.library.domain.StudentDepartment;
import com.serdardemirci.library.repo.StudentDepartmentDao;
import com.serdardemirci.library.service.StudentDepartmentService;

public class StudentDepartmentServiceImpl implements StudentDepartmentService {

    private final StudentDepartmentDao studentDepartmentDao;

    public StudentDepartmentServiceImpl(StudentDepartmentDao studentDepartmentDao) {
        this.studentDepartmentDao = studentDepartmentDao;
    }

    @Override
    public void add(StudentDepartment studentDepartment) {
        this.studentDepartmentDao.save(studentDepartment);
    }

    @Override
    public StudentDepartment getStudentDepartmentById(int id) {
        return this.studentDepartmentDao.getById(id);
    }
}
