package com.ipanda.dao;

import com.ipanda.domain.Student;
import com.ipanda.domain.Teacher;

public interface SchoolRepository {
    /**
     * 获取学生信息
     * @return
     */
    Student getStudentInfo();

    /**
     * 获取老师信息
     * @return
     */
    Teacher getTeacherInfo();
}
