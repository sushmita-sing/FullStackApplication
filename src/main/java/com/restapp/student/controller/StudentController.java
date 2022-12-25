package com.restapp.student.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

    @GetMapping("/show")
    String display(){
        return "Hello There!!";
    }
}
