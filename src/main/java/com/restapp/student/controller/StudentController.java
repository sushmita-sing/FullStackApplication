package com.restapp.student.controller;

import com.restapp.student.model.Student;
import com.restapp.student.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Student saved..";
    }
    @GetMapping("/get")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/show")
    String display(){
        return "Hello There!!";
    }
}
