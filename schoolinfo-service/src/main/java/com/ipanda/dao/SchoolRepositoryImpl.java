package com.ipanda.dao;

import com.ipanda.domain.Student;
import com.ipanda.domain.Teacher;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SchoolRepositoryImpl implements SchoolRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Student getStudentInfo() {
        return (Student) entityManager.createQuery("FROM Student").getResultList().get(0);
    }

    @Override
    public Teacher getTeacherInfo() {
        return (Teacher) entityManager.createQuery("FROM Teacher").getResultList().get(0);
    }
}