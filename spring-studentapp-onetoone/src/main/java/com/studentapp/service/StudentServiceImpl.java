package com.studentapp.service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{

    private IStudentRepository repo;

    @Autowired
    public void setRepo(IStudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student addStudent(Student stud) {
        return repo.save(stud);
    }

    @Override
    public Student updateStudent(Student stud) {
        return null;
    }

    @Override
    public void deleteStudent(int studId) {

    }
}
