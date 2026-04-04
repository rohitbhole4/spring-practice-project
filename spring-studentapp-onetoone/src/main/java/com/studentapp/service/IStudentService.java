    package com.studentapp.service;

    import com.studentapp.model.Student;

    public interface IStudentService {
        Student addStudent(Student stud);
        Student updateStudent(Student stud);
        void deleteStudent(int studId);
    }