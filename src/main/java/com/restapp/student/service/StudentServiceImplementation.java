package com.restapp.student.service;

import com.restapp.student.model.Student;
import com.restapp.student.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImplementation implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
