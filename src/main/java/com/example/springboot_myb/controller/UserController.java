package com.example.springboot_myb.controller;

import com.example.springboot_myb.model.Student;
import com.example.springboot_myb.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    StudentMapper studentMapper;
    @RequestMapping("/hello")
    public String getHello(){
        return "hello hi!";
    }
    @RequestMapping("/ssm")
    public List<Student> getList(){
        List<Student> students = studentMapper.findAll();
        return students;
    }
}
