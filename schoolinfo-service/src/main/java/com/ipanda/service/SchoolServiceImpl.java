package com.ipanda.service;

import com.ipanda.dao.SchoolRepository;
import com.ipanda.domain.Student;
import com.ipanda.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService{
    @Autowired
    SchoolRepository schoolRepository;

    /**
     * 获取学生信息
     * @return
     */
    @Override
    public Student getStudnetInfo() {
        return schoolRepository.getStudentInfo();
    }

    /**
     * 获取老师信息
     * @return
     */
    @Override
    public Teacher getTeacherInfo() {
        return schoolRepository.getTeacherInfo();
    }
}