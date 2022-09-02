package com.example.springtest.service;

import com.example.springtest.dao.StudentDao;
import com.example.springtest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student getStudent(){
        return studentDao.getStudent();
    }

    public String getStudentLogin(String username,String password){
        if (username.equals(studentDao.getStudent().getSname())){
            if (password.equals(studentDao.getStudent().getSid())){
                return "登陆成功";
            }else {
                return "用户名或密码错误";
            }
        }else {
            return "用户名或密码错误";
        }
    }
}
