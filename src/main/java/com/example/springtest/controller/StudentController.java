package com.example.springtest.controller;

import com.example.springtest.dao.StudentDao;
import com.example.springtest.entity.Student;
import com.example.springtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getstu")
    public Student getStudent(){
        return studentService.getStudent();
    }

    @GetMapping("/getstu/login")
    public String getStudentLogin(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "password") String password){
        return studentService.getStudentLogin(username,password);
    }
}
