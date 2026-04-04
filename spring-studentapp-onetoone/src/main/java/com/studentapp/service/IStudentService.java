    package com.studentapp.service;

    import com.studentapp.model.Student;

    import java.util.List;

    public interface IStudentService {
        Student addStudent(Student stud);
        Student updateStudent(Student stud);
        void deleteStudent(int studId);
        Student getById(int studId);
        List<Student> findAll();
        List<Student> findByDept (String dept);
        List<Student> findByAddressCity (String city);
    }