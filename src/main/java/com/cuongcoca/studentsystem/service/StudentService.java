package com.cuongcoca.studentsystem.service;

import com.cuongcoca.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    List<Student> getAll();
}
