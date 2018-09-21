package com.ipanda.service;


import com.ipanda.domain.Student;
import com.ipanda.domain.Teacher;

public interface SchoolService {
    /**
     * 获取学生信息
     * @return
     */
    Student getStudnetInfo();

    /**
     * 获取老师信息
     * @return
     */
    Teacher getTeacherInfo();
}