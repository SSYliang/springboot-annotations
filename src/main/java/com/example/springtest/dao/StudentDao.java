package com.example.springtest.dao;

import com.example.springtest.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    private Student student;

    public StudentDao() {
        this.student = new Student("1002","张三",18);
    }

    public Student getStudent(){
        return this.student;
    }
}
