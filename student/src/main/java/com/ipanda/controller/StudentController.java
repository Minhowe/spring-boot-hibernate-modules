package com.ipanda.controller;

import com.ipanda.domain.Student;
import com.ipanda.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    SchoolService schoolService;
    @RequestMapping(value = "/getInfo")
    public Student getInfo() {
        return schoolService.getStudnetInfo();
    }
}