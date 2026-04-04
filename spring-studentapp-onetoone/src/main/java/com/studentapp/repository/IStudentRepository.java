package com.studentapp.repository;

import com.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByDept (String dept);
    List<Student> findByAddressCity (String city);
}
