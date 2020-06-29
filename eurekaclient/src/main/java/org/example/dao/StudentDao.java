package org.example.dao;

import org.example.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public interface StudentDao {

    Collection<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    void update(Student student);

    void deleteById(Long id);
}
