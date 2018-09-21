package com.ipanda.controller;

import com.ipanda.domain.Teacher;
import com.ipanda.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    SchoolService schoolService;
    @RequestMapping(value = "/getInfo")
    public Teacher getInfo(){
        return schoolService.getTeacherInfo();
    }
}